package ru.ok.android.externcalls.sdk.stat;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.gzs;
import xsna.j7e0;
import xsna.msy;
import xsna.pzl;
import xsna.qcy;
import xsna.wzs;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class StatsKt$layout$$inlined$keyCreator$calls_sdk_stat_release$1<T, D> implements j7e0 {
    final /* synthetic */ KeyPropBehavior $behavior;
    final /* synthetic */ wzs $extractor$inlined;
    final /* synthetic */ VideoTrackType $videoTrackType$inlined;

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* compiled from: Stats.kt */
    /* renamed from: ru.ok.android.externcalls.sdk.stat.StatsKt$layout$$inlined$keyCreator$calls_sdk_stat_release$1$1, reason: invalid class name */
    public static final class AnonymousClass1<V> implements StatKey<V>, StatBehavior {
        private final /* synthetic */ KeyPropBehavior $$delegate_0;
        final /* synthetic */ wzs $extractor$inlined;
        final /* synthetic */ VideoTrackType $videoTrackType$inlined;
        private final Lazy fullName$delegate;
        private final StatGroup group;
        private final String name;

        public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, VideoTrackType videoTrackType, wzs wzsVar) {
            this.$videoTrackType$inlined = videoTrackType;
            this.$extractor$inlined = wzsVar;
            this.$$delegate_0 = keyPropBehavior;
            this.name = str;
            this.group = statGroup;
            this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.StatsKt$layout$.inlined.keyCreator.calls_sdk_stat_release.1.1.1
                @Override // xsna.gzs
                public final String invoke() {
                    return pzl.b(StatGroup.this.getFullName(), ".", str);
                }
            });
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatKey
        public V doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
            T t;
            Map<CallParticipant.ParticipantId, List<CallDisplayLayoutItem>> latestLayouts = statPack.getLatestLayouts();
            if (latestLayouts != null) {
                ParticipantId participantId = innerExtractionContext.participantId();
                List<CallDisplayLayoutItem> list = latestLayouts.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = (T) null;
                            break;
                        }
                        t = it.next();
                        if (((CallDisplayLayoutItem) t).getVideoTrackParticipantKey().getType() == this.$videoTrackType$inlined) {
                            break;
                        }
                    }
                    CallDisplayLayoutItem callDisplayLayoutItem = t;
                    if (callDisplayLayoutItem != null) {
                        return (V) this.$extractor$inlined.invoke(callDisplayLayoutItem, innerExtractionContext);
                    }
                }
            }
            return null;
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
        public boolean getDerived() {
            return this.$$delegate_0.getDerived();
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatKey
        public String getFullName() {
            return (String) this.fullName$delegate.getValue();
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatKey
        public StatGroup getGroup() {
            return this.group;
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
        public boolean getHumanReadable() {
            return this.$$delegate_0.getHumanReadable();
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
        public boolean getMonotonic() {
            return this.$$delegate_0.getMonotonic();
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatKey
        public String getName() {
            return this.name;
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
        public boolean getStatic() {
            return this.$$delegate_0.getStatic();
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
        public boolean getSynthetic() {
            return this.$$delegate_0.getSynthetic();
        }
    }

    public StatsKt$layout$$inlined$keyCreator$calls_sdk_stat_release$1(KeyPropBehavior keyPropBehavior, VideoTrackType videoTrackType, wzs wzsVar) {
        this.$behavior = keyPropBehavior;
        this.$videoTrackType$inlined = videoTrackType;
        this.$extractor$inlined = wzsVar;
    }

    @Override // xsna.j7e0
    public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
        return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
    }

    public final SimpleKeyProp<V> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
        SimpleKeyProp<V> simpleKeyProp = new SimpleKeyProp<>(null);
        simpleKeyProp.setValue(new AnonymousClass1(this.$behavior, qcyVar.getName(), statGroup, this.$videoTrackType$inlined, this.$extractor$inlined));
        statGroup.register$calls_sdk_stat_release(simpleKeyProp);
        return simpleKeyProp;
    }
}
