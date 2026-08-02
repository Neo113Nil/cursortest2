package ru.ok.android.externcalls.sdk.stat.view;

import android.widget.TextView;
import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stat.ExtractionContext;
import ru.ok.android.externcalls.sdk.stat.ExtractionContextState;
import ru.ok.android.externcalls.sdk.stat.StatGroup;
import ru.ok.android.externcalls.sdk.stat.StatKey;
import ru.ok.android.externcalls.sdk.stat.StatProcessor;
import ru.ok.android.externcalls.sdk.stat.StatSets;
import ru.ok.android.externcalls.sdk.stat.StatState;
import ru.ok.android.externcalls.sdk.stat.StatValue;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: TextStatRenderer.kt */
/* loaded from: classes9.dex */
public final class TextStatRenderer implements ExtractionContext, ExtractionContextState {
    private izs<? super CharSequence, s3q0> consumer;
    private ParticipantId participantId;
    private StatProcessor processor;
    private Set<? extends StatKey<?>> statSet;
    private final StatState statState;
    private final LinkedHashMap<StatKey<?>, StatValue<?>> statValueCache;
    private c subscription;

    /* JADX WARN: Multi-variable type inference failed */
    public TextStatRenderer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Set<StatKey<?>> defaultStatSet(ParticipantId participantId) {
        Conversation conversation;
        ConversationParticipant me2;
        StatProcessor statProcessor = this.processor;
        if (statProcessor != null && (conversation = statProcessor.getConversation()) != null && (me2 = conversation.getMe()) != null) {
            Set<StatKey<?>> renderableOut = me2.getExternalId().equals(participantId) ? StatSets.INSTANCE.getRenderableOut() : StatSets.INSTANCE.getRenderableIn();
            if (renderableOut != null) {
                return renderableOut;
            }
        }
        return EmptySet.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStats() {
        Map<StatKey<?>, ? extends StatValue<?>> stats;
        if (this.participantId == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        this.statValueCache.clear();
        StatProcessor statProcessor = this.processor;
        if (statProcessor == null || (stats = statProcessor.getStats(this.statSet, this, this.statValueCache)) == null) {
            return;
        }
        this.statState.update(stats);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<StatKey<?>, ? extends StatValue<?>> entry : stats.entrySet()) {
            if (this.statSet.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set entrySet = linkedHashMap.entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj : entrySet) {
            StatGroup group = ((StatKey) ((Map.Entry) obj).getKey()).getGroup();
            Object obj2 = linkedHashMap2.get(group);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap2.put(group, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            StatGroup statGroup = (StatGroup) entry2.getKey();
            List<Map.Entry> list = (List) entry2.getValue();
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it.next();
                        if (!valueConsideredEmpty(entry3.getValue()) && this.statSet.contains(entry3.getKey())) {
                            sb.append('[');
                            sb.append(statGroup != null ? statGroup.getFullName() : null);
                            sb.append("]\n");
                            for (Map.Entry entry4 : list) {
                                StatKey statKey = (StatKey) entry4.getKey();
                                Object value = ((StatValue) entry4.getValue()).getValue();
                                if (!valueConsideredEmpty(value) && this.statSet.contains(statKey)) {
                                    sb.append("  ");
                                    sb.append(statKey.getName());
                                    sb.append(" : ");
                                    if (value instanceof Double) {
                                        sb.append(String.format("%.2f", Arrays.copyOf(new Object[]{value}, 1)));
                                    } else {
                                        sb.append(value);
                                    }
                                    sb.append('\n');
                                }
                            }
                        }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        izs<? super CharSequence, s3q0> izsVar = this.consumer;
        if (izsVar != null) {
            izsVar.invoke(sb);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSource$default(TextStatRenderer textStatRenderer, ParticipantId participantId, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = textStatRenderer.defaultStatSet(participantId);
        }
        textStatRenderer.setSource(participantId, set);
    }

    private final boolean valueConsideredEmpty(Object obj) {
        return obj == null;
    }

    public final void clearConsumer() {
        this.consumer = null;
    }

    @Override // ru.ok.android.externcalls.sdk.stat.ExtractionContext
    public ParticipantId participantId() {
        return this.participantId;
    }

    @Override // ru.ok.android.externcalls.sdk.stat.ExtractionContextState
    public <V> StatValue<V> previousValue(StatKey<? extends V> statKey) {
        return this.statState.previousValue(statKey);
    }

    public final void setSource(ParticipantId participantId, Set<? extends StatKey<? extends Object>> set) {
        if (epx.f(participantId, this.participantId) && epx.f(this.statSet, set)) {
            return;
        }
        this.participantId = participantId;
        this.statSet = set;
        this.statState.clear();
    }

    public final void setStatProcessor(StatProcessor statProcessor) {
        if (this.processor != null) {
            c cVar = this.subscription;
            if (cVar != null) {
                cVar.dispose();
            }
            this.subscription = null;
        }
        this.processor = statProcessor;
        if (statProcessor != null) {
            this.subscription = statProcessor.getObservable().a0(a.b()).subscribe(new f() { // from class: ru.ok.android.externcalls.sdk.stat.view.TextStatRenderer$setStatProcessor$2$1
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(s3q0 s3q0Var) {
                    TextStatRenderer.this.onStats();
                }
            });
        }
    }

    public final void setTextConsumer(izs<? super CharSequence, s3q0> izsVar) {
        this.consumer = izsVar;
    }

    public TextStatRenderer(StatState statState) {
        this.statState = statState;
        this.statSet = EmptySet.b;
        this.statValueCache = new LinkedHashMap<>();
    }

    public final void setTextConsumer(TextView textView) {
        this.consumer = new TextStatRenderer$setTextConsumer$1(textView);
    }

    public /* synthetic */ TextStatRenderer(StatState statState, int i, zcl zclVar) {
        this((i & 1) != 0 ? new StatState() : statState);
    }
}
