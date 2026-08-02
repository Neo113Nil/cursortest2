package ru.ok.android.externcalls.sdk.stat;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import xsna.gzs;
import xsna.j5g;
import xsna.j7e0;
import xsna.msy;
import xsna.pzl;
import xsna.qcy;
import xsna.wzs;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class StatsKt$audioIn$$inlined$keyCreator$calls_sdk_stat_release$1<T, D> implements j7e0 {
    final /* synthetic */ KeyPropBehavior $behavior;
    final /* synthetic */ wzs $extractor$inlined;

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* compiled from: Stats.kt */
    /* renamed from: ru.ok.android.externcalls.sdk.stat.StatsKt$audioIn$$inlined$keyCreator$calls_sdk_stat_release$1$1, reason: invalid class name */
    public static final class AnonymousClass1<V> implements StatKey<V>, StatBehavior {
        private final /* synthetic */ KeyPropBehavior $$delegate_0;
        final /* synthetic */ wzs $extractor$inlined;
        private final Lazy fullName$delegate;
        private final StatGroup group;
        private final String name;

        public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, wzs wzsVar) {
            this.$extractor$inlined = wzsVar;
            this.$$delegate_0 = keyPropBehavior;
            this.name = str;
            this.group = statGroup;
            this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.StatsKt$audioIn$.inlined.keyCreator.calls_sdk_stat_release.1.1.1
                @Override // xsna.gzs
                public final String invoke() {
                    return pzl.b(StatGroup.this.getFullName(), ".", str);
                }
            });
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatKey
        public V doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
            List<Ssrc.AudioRecv> list;
            Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
            Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
            if (audioRecv != null) {
                return (V) this.$extractor$inlined.invoke(audioRecv, innerExtractionContext);
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

    public StatsKt$audioIn$$inlined$keyCreator$calls_sdk_stat_release$1(KeyPropBehavior keyPropBehavior, wzs wzsVar) {
        this.$behavior = keyPropBehavior;
        this.$extractor$inlined = wzsVar;
    }

    @Override // xsna.j7e0
    public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
        return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
    }

    public final SimpleKeyProp<V> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
        SimpleKeyProp<V> simpleKeyProp = new SimpleKeyProp<>(null);
        simpleKeyProp.setValue(new AnonymousClass1(this.$behavior, qcyVar.getName(), statGroup, this.$extractor$inlined));
        statGroup.register$calls_sdk_stat_release(simpleKeyProp);
        return simpleKeyProp;
    }
}
