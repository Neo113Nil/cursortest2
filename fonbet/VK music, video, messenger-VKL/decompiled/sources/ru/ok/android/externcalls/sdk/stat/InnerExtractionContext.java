package ru.ok.android.externcalls.sdk.stat;

import java.util.Map;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.epx;
import xsna.v11;

/* compiled from: StatDefinitions.kt */
/* loaded from: classes9.dex */
public final class InnerExtractionContext implements ExtractionContext {
    private final Conversation conversation;
    private final ExtractionContext outer;
    private final StatProcessor processor;
    private final Map<StatKey<?>, StatValue<?>> results;

    public InnerExtractionContext(Conversation conversation, StatProcessor statProcessor, Map<StatKey<?>, StatValue<?>> map, ExtractionContext extractionContext) {
        this.conversation = conversation;
        this.processor = statProcessor;
        this.results = map;
        this.outer = extractionContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InnerExtractionContext copy$default(InnerExtractionContext innerExtractionContext, Conversation conversation, StatProcessor statProcessor, Map map, ExtractionContext extractionContext, int i, Object obj) {
        if ((i & 1) != 0) {
            conversation = innerExtractionContext.conversation;
        }
        if ((i & 2) != 0) {
            statProcessor = innerExtractionContext.processor;
        }
        if ((i & 4) != 0) {
            map = innerExtractionContext.results;
        }
        if ((i & 8) != 0) {
            extractionContext = innerExtractionContext.outer;
        }
        return innerExtractionContext.copy(conversation, statProcessor, map, extractionContext);
    }

    public final Conversation component1() {
        return this.conversation;
    }

    public final StatProcessor component2() {
        return this.processor;
    }

    public final Map<StatKey<?>, StatValue<?>> component3() {
        return this.results;
    }

    public final ExtractionContext component4() {
        return this.outer;
    }

    public final InnerExtractionContext copy(Conversation conversation, StatProcessor statProcessor, Map<StatKey<?>, StatValue<?>> map, ExtractionContext extractionContext) {
        return new InnerExtractionContext(conversation, statProcessor, map, extractionContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerExtractionContext)) {
            return false;
        }
        InnerExtractionContext innerExtractionContext = (InnerExtractionContext) obj;
        return epx.f(this.conversation, innerExtractionContext.conversation) && epx.f(this.processor, innerExtractionContext.processor) && epx.f(this.results, innerExtractionContext.results) && epx.f(this.outer, innerExtractionContext.outer);
    }

    public final Conversation getConversation() {
        return this.conversation;
    }

    public final ExtractionContext getOuter() {
        return this.outer;
    }

    public final StatProcessor getProcessor() {
        return this.processor;
    }

    public final Map<StatKey<?>, StatValue<?>> getResults() {
        return this.results;
    }

    public int hashCode() {
        return this.outer.hashCode() + v11.a((this.processor.hashCode() + (this.conversation.hashCode() * 31)) * 31, 31, this.results);
    }

    @Override // ru.ok.android.externcalls.sdk.stat.ExtractionContext
    public ParticipantId participantId() {
        return this.outer.participantId();
    }

    @Override // ru.ok.android.externcalls.sdk.stat.ExtractionContextState
    public <V> StatValue<V> previousValue(StatKey<? extends V> statKey) {
        return this.outer.previousValue(statKey);
    }

    public String toString() {
        return "InnerExtractionContext(conversation=" + this.conversation + ", processor=" + this.processor + ", results=" + this.results + ", outer=" + this.outer + ")";
    }
}
