package ru.ok.android.externcalls.sdk.stat;

import android.util.Size;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stat.SimpleKeyProp;
import ru.ok.android.webrtc.DataChannels;
import ru.ok.android.webrtc.animoji.stats.AnimojiParticipantStat;
import ru.ok.android.webrtc.animoji.stats.AnimojiStat;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.b09;
import xsna.fpf0;
import xsna.gzs;
import xsna.j7e0;
import xsna.msy;
import xsna.pzl;
import xsna.qcy;
import xsna.u11;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class Animoji extends StatGroup {
    public static final Animoji INSTANCE = new Animoji();

    /* compiled from: Stats.kt */
    public static final class Common extends StatGroup {
        static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
        public static final Common INSTANCE;
        private static final KeyProp bytesRecv$delegate;
        private static final KeyProp bytesRecvPerSec$delegate;
        private static final KeyProp bytesSent$delegate;
        private static final KeyProp bytesSentPerSec$delegate;
        private static final KeyProp mlConfigPath$delegate;
        private static final KeyProp mlEnabled$delegate;
        private static final KeyProp mlLandmarksInferredCount$delegate;
        private static final KeyProp mlLandmarksInferredCountPerSec$delegate;
        private static final KeyProp packagesDropped$delegate;
        private static final KeyProp packagesQueued$delegate;
        private static final KeyProp packagesRecv$delegate;
        private static final KeyProp packagesSent$delegate;

        static {
            qcy<?>[] qcyVarArr = {new PropertyReference1Impl(Common.class, "bytesSent", "getBytesSent()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), b09.a(0, Common.class, "bytesSentPerSec", "getBytesSentPerSec()Lru/ok/android/externcalls/sdk/stat/StatKey;", fpf0.a), new PropertyReference1Impl(Common.class, "packagesSent", "getPackagesSent()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Common.class, "packagesQueued", "getPackagesQueued()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Common.class, "packagesDropped", "getPackagesDropped()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Common.class, "bytesRecv", "getBytesRecv()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Common.class, "bytesRecvPerSec", "getBytesRecvPerSec()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Common.class, "packagesRecv", "getPackagesRecv()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Common.class, "mlEnabled", "getMlEnabled()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Common.class, "mlConfigPath", "getMlConfigPath()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Common.class, "mlLandmarksInferredCount", "getMlLandmarksInferredCount()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Common.class, "mlLandmarksInferredCountPerSec", "getMlLandmarksInferredCountPerSec()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0)};
            $$delegatedProperties = qcyVarArr;
            Common common = new Common();
            INSTANCE = common;
            final KeyPropBehavior keyPropBehavior = new KeyPropBehavior(false, true, false, false, false, 13, null);
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            bytesSent$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$.inlined.animoji.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        if (statPack.getAnimojiStat() != null) {
                            return Long.valueOf(r1.getBytesSent());
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(common, qcyVarArr[0]);
            final StatKey<Long> bytesSent = common.getBytesSent();
            final KeyPropBehavior copy$default = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, false, false, 31, null), false, false, true, false, false, 27, null);
            bytesSentPerSec$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$perSecond$default$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$perSecond$default$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Double>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    final /* synthetic */ StatKey $source$inlined;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, StatKey statKey) {
                        this.$source$inlined = statKey;
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$.inlined.perSecond.default.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Long l;
                        Long l2 = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l2 != null) {
                            long longValue = l2.longValue();
                            Long l3 = (Long) this.$source$inlined.extract(statPack, innerExtractionContext).getValue();
                            if (l3 != null) {
                                long longValue2 = l3.longValue();
                                StatValue previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined);
                                if (previousValue != null && (l = (Long) previousValue.getValue()) != null) {
                                    return Double.valueOf((longValue2 - l.longValue()) / (longValue / 1000.0d));
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Double> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Double> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, bytesSent));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(common, qcyVarArr[1]);
            final KeyPropBehavior keyPropBehavior2 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            packagesSent$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$.inlined.animoji.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        AnimojiStat animojiStat = statPack.getAnimojiStat();
                        if (animojiStat != null) {
                            return Integer.valueOf(animojiStat.getPackagesSent());
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Integer> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Integer> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(common, qcyVarArr[2]);
            final KeyPropBehavior keyPropBehavior3 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            packagesQueued$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$3

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$3$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$.inlined.animoji.3.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        AnimojiStat animojiStat = statPack.getAnimojiStat();
                        if (animojiStat != null) {
                            return Integer.valueOf(animojiStat.getPackagesQueued());
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Integer> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Integer> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(common, qcyVarArr[3]);
            final KeyPropBehavior keyPropBehavior4 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            packagesDropped$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$4

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$4$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$.inlined.animoji.4.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        AnimojiStat animojiStat = statPack.getAnimojiStat();
                        if (animojiStat != null) {
                            return Integer.valueOf(animojiStat.getPackagesDropped());
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Integer> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Integer> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(common, qcyVarArr[4]);
            final KeyPropBehavior keyPropBehavior5 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            bytesRecv$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$5

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$5$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$.inlined.animoji.5.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        if (statPack.getAnimojiStat() != null) {
                            return Long.valueOf(r1.getBytesRecv());
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(common, qcyVarArr[5]);
            final StatKey<Long> bytesRecv = common.getBytesRecv();
            final KeyPropBehavior copy$default2 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, false, false, 31, null), false, false, true, false, false, 27, null);
            bytesRecvPerSec$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$perSecond$default$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$perSecond$default$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Double>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    final /* synthetic */ StatKey $source$inlined;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, StatKey statKey) {
                        this.$source$inlined = statKey;
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$.inlined.perSecond.default.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Long l;
                        Long l2 = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l2 != null) {
                            long longValue = l2.longValue();
                            Long l3 = (Long) this.$source$inlined.extract(statPack, innerExtractionContext).getValue();
                            if (l3 != null) {
                                long longValue2 = l3.longValue();
                                StatValue previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined);
                                if (previousValue != null && (l = (Long) previousValue.getValue()) != null) {
                                    return Double.valueOf((longValue2 - l.longValue()) / (longValue / 1000.0d));
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Double> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Double> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, bytesRecv));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(common, qcyVarArr[6]);
            final KeyPropBehavior keyPropBehavior6 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            packagesRecv$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$6

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$6$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$.inlined.animoji.6.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        AnimojiStat animojiStat = statPack.getAnimojiStat();
                        if (animojiStat != null) {
                            return Integer.valueOf(animojiStat.getPackagesSent());
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Integer> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Integer> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(common, qcyVarArr[7]);
            final KeyPropBehavior keyPropBehavior7 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            mlEnabled$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$default$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$default$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Boolean>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$.inlined.animoji.default.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Boolean doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        AnimojiStat animojiStat = statPack.getAnimojiStat();
                        if (animojiStat != null) {
                            return Boolean.valueOf(animojiStat.getMlEnabled());
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Boolean> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Boolean> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(common, qcyVarArr[8]);
            final KeyPropBehavior keyPropBehavior8 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            mlConfigPath$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$default$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$default$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$.inlined.animoji.default.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        AnimojiStat animojiStat = statPack.getAnimojiStat();
                        if (animojiStat != null) {
                            return animojiStat.getMlConfigPath();
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<String> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<String> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(common, qcyVarArr[9]);
            final KeyPropBehavior keyPropBehavior9 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            mlLandmarksInferredCount$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$default$3

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$animoji$default$3$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$.inlined.animoji.default.3.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        if (statPack.getAnimojiStat() != null) {
                            return Long.valueOf(r1.getMlLandmarks());
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(common, qcyVarArr[10]);
            final StatKey<Long> mlLandmarksInferredCount = common.getMlLandmarksInferredCount();
            final KeyPropBehavior copy$default3 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, false, false, 31, null), false, false, true, false, false, 27, null);
            mlLandmarksInferredCountPerSec$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$perSecond$default$3

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$$inlined$perSecond$default$3$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Double>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    final /* synthetic */ StatKey $source$inlined;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, StatKey statKey) {
                        this.$source$inlined = statKey;
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Common$special$.inlined.perSecond.default.3.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Long l;
                        Long l2 = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l2 != null) {
                            long longValue = l2.longValue();
                            Long l3 = (Long) this.$source$inlined.extract(statPack, innerExtractionContext).getValue();
                            if (l3 != null) {
                                long longValue2 = l3.longValue();
                                StatValue previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined);
                                if (previousValue != null && (l = (Long) previousValue.getValue()) != null) {
                                    return Double.valueOf((longValue2 - l.longValue()) / (longValue / 1000.0d));
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Double> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Double> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, mlLandmarksInferredCount));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(common, qcyVarArr[11]);
        }

        private Common() {
            super("common", Animoji.INSTANCE, null);
        }

        public final StatKey<Long> getBytesRecv() {
            return (StatKey) bytesRecv$delegate.getValue(this, $$delegatedProperties[5]);
        }

        public final StatKey<Double> getBytesRecvPerSec() {
            return (StatKey) bytesRecvPerSec$delegate.getValue(this, $$delegatedProperties[6]);
        }

        public final StatKey<Long> getBytesSent() {
            return (StatKey) bytesSent$delegate.getValue(this, $$delegatedProperties[0]);
        }

        public final StatKey<Double> getBytesSentPerSec() {
            return (StatKey) bytesSentPerSec$delegate.getValue(this, $$delegatedProperties[1]);
        }

        public final StatKey<String> getMlConfigPath() {
            return (StatKey) mlConfigPath$delegate.getValue(this, $$delegatedProperties[9]);
        }

        public final StatKey<Boolean> getMlEnabled() {
            return (StatKey) mlEnabled$delegate.getValue(this, $$delegatedProperties[8]);
        }

        public final StatKey<Long> getMlLandmarksInferredCount() {
            return (StatKey) mlLandmarksInferredCount$delegate.getValue(this, $$delegatedProperties[10]);
        }

        public final StatKey<Double> getMlLandmarksInferredCountPerSec() {
            return (StatKey) mlLandmarksInferredCountPerSec$delegate.getValue(this, $$delegatedProperties[11]);
        }

        public final StatKey<Integer> getPackagesDropped() {
            return (StatKey) packagesDropped$delegate.getValue(this, $$delegatedProperties[4]);
        }

        public final StatKey<Integer> getPackagesQueued() {
            return (StatKey) packagesQueued$delegate.getValue(this, $$delegatedProperties[3]);
        }

        public final StatKey<Integer> getPackagesRecv() {
            return (StatKey) packagesRecv$delegate.getValue(this, $$delegatedProperties[7]);
        }

        public final StatKey<Integer> getPackagesSent() {
            return (StatKey) packagesSent$delegate.getValue(this, $$delegatedProperties[2]);
        }
    }

    /* compiled from: Stats.kt */
    public static final class Participant extends StatGroup {
        static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
        public static final Participant INSTANCE;
        private static final KeyProp dispatchedFrames$delegate;
        private static final KeyProp dispatchedRecvLandmarks$delegate;
        private static final KeyProp fps$delegate;
        private static final KeyProp landmarksPerSecond$delegate;
        private static final KeyProp renderResolution$delegate;
        private static final KeyProp renderedFrames$delegate;

        static {
            qcy<?>[] qcyVarArr = {new PropertyReference1Impl(Participant.class, "dispatchedRecvLandmarks", "getDispatchedRecvLandmarks()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), b09.a(0, Participant.class, "landmarksPerSecond", "getLandmarksPerSecond()Lru/ok/android/externcalls/sdk/stat/StatKey;", fpf0.a), new PropertyReference1Impl(Participant.class, "renderedFrames", "getRenderedFrames()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Participant.class, "fps", "getFps()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Participant.class, "dispatchedFrames", "getDispatchedFrames()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Participant.class, "renderResolution", "getRenderResolution()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0)};
            $$delegatedProperties = qcyVarArr;
            Participant participant = new Participant();
            INSTANCE = participant;
            final KeyPropBehavior keyPropBehavior = new KeyPropBehavior(false, true, false, false, false, 29, null);
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            dispatchedRecvLandmarks$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$$inlined$animojiForParticipant$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$$inlined$animojiForParticipant$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$.inlined.animojiForParticipant.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        AnimojiStat animojiStat;
                        CallParticipant.ParticipantId internal2;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        if (participantId == null || (animojiStat = statPack.getAnimojiStat()) == null) {
                            return null;
                        }
                        Map<CallParticipant.ParticipantId, AnimojiParticipantStat> participantStats = animojiStat.getParticipantStats();
                        internal2 = StatsKt.toInternal(participantId, innerExtractionContext);
                        if (participantStats.get(internal2) == null) {
                            return null;
                        }
                        return Long.valueOf(r3.getDispatchedLandmarks());
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(participant, qcyVarArr[0]);
            final StatKey<Long> dispatchedRecvLandmarks = participant.getDispatchedRecvLandmarks();
            final KeyPropBehavior copy$default = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, false, false, 31, null), false, false, true, false, false, 27, null);
            landmarksPerSecond$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$$inlined$perSecond$default$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$$inlined$perSecond$default$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Double>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    final /* synthetic */ StatKey $source$inlined;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, StatKey statKey) {
                        this.$source$inlined = statKey;
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$.inlined.perSecond.default.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Long l;
                        Long l2 = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l2 != null) {
                            long longValue = l2.longValue();
                            Long l3 = (Long) this.$source$inlined.extract(statPack, innerExtractionContext).getValue();
                            if (l3 != null) {
                                long longValue2 = l3.longValue();
                                StatValue previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined);
                                if (previousValue != null && (l = (Long) previousValue.getValue()) != null) {
                                    return Double.valueOf((longValue2 - l.longValue()) / (longValue / 1000.0d));
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Double> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Double> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, dispatchedRecvLandmarks));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(participant, qcyVarArr[1]);
            final KeyPropBehavior keyPropBehavior2 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            renderedFrames$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$$inlined$animojiForParticipant$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$$inlined$animojiForParticipant$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$.inlined.animojiForParticipant.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        AnimojiStat animojiStat;
                        CallParticipant.ParticipantId internal2;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        if (participantId == null || (animojiStat = statPack.getAnimojiStat()) == null) {
                            return null;
                        }
                        Map<CallParticipant.ParticipantId, AnimojiParticipantStat> participantStats = animojiStat.getParticipantStats();
                        internal2 = StatsKt.toInternal(participantId, innerExtractionContext);
                        if (participantStats.get(internal2) == null) {
                            return null;
                        }
                        return Long.valueOf(r3.getDrawnFrames());
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(participant, qcyVarArr[2]);
            final StatKey<Long> renderedFrames = participant.getRenderedFrames();
            final KeyPropBehavior copy$default2 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, false, false, 31, null), false, false, true, false, false, 27, null);
            fps$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$$inlined$perSecond$default$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$$inlined$perSecond$default$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Double>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    final /* synthetic */ StatKey $source$inlined;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, StatKey statKey) {
                        this.$source$inlined = statKey;
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$.inlined.perSecond.default.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Long l;
                        Long l2 = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l2 != null) {
                            long longValue = l2.longValue();
                            Long l3 = (Long) this.$source$inlined.extract(statPack, innerExtractionContext).getValue();
                            if (l3 != null) {
                                long longValue2 = l3.longValue();
                                StatValue previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined);
                                if (previousValue != null && (l = (Long) previousValue.getValue()) != null) {
                                    return Double.valueOf((longValue2 - l.longValue()) / (longValue / 1000.0d));
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Double> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Double> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, renderedFrames));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(participant, qcyVarArr[3]);
            final KeyPropBehavior keyPropBehavior3 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            dispatchedFrames$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$$inlined$animojiForParticipant$3

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$$inlined$animojiForParticipant$3$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$.inlined.animojiForParticipant.3.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        AnimojiStat animojiStat;
                        CallParticipant.ParticipantId internal2;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        if (participantId == null || (animojiStat = statPack.getAnimojiStat()) == null) {
                            return null;
                        }
                        Map<CallParticipant.ParticipantId, AnimojiParticipantStat> participantStats = animojiStat.getParticipantStats();
                        internal2 = StatsKt.toInternal(participantId, innerExtractionContext);
                        AnimojiParticipantStat animojiParticipantStat = participantStats.get(internal2);
                        if (animojiParticipantStat == null) {
                            return null;
                        }
                        return Integer.valueOf(animojiParticipantStat.getDispatchedFrames());
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Integer> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Integer> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(participant, qcyVarArr[4]);
            final KeyPropBehavior keyPropBehavior4 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            renderResolution$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$$inlined$animojiForParticipant$4

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$$inlined$animojiForParticipant$4$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Size>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Animoji$Participant$special$.inlined.animojiForParticipant.4.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Size doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        AnimojiStat animojiStat;
                        CallParticipant.ParticipantId internal2;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        if (participantId == null || (animojiStat = statPack.getAnimojiStat()) == null) {
                            return null;
                        }
                        Map<CallParticipant.ParticipantId, AnimojiParticipantStat> participantStats = animojiStat.getParticipantStats();
                        internal2 = StatsKt.toInternal(participantId, innerExtractionContext);
                        AnimojiParticipantStat animojiParticipantStat = participantStats.get(internal2);
                        if (animojiParticipantStat == null) {
                            return null;
                        }
                        return animojiParticipantStat.getRenderResolution();
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

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Size> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Size> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(participant, qcyVarArr[5]);
        }

        private Participant() {
            super(SignalingProtocol.KEY_PARTICIPANT, Animoji.INSTANCE, null);
        }

        public final StatKey<Integer> getDispatchedFrames() {
            return (StatKey) dispatchedFrames$delegate.getValue(this, $$delegatedProperties[4]);
        }

        public final StatKey<Long> getDispatchedRecvLandmarks() {
            return (StatKey) dispatchedRecvLandmarks$delegate.getValue(this, $$delegatedProperties[0]);
        }

        public final StatKey<Double> getFps() {
            return (StatKey) fps$delegate.getValue(this, $$delegatedProperties[3]);
        }

        public final StatKey<Double> getLandmarksPerSecond() {
            return (StatKey) landmarksPerSecond$delegate.getValue(this, $$delegatedProperties[1]);
        }

        public final StatKey<Size> getRenderResolution() {
            return (StatKey) renderResolution$delegate.getValue(this, $$delegatedProperties[5]);
        }

        public final StatKey<Long> getRenderedFrames() {
            return (StatKey) renderedFrames$delegate.getValue(this, $$delegatedProperties[2]);
        }
    }

    private Animoji() {
        super(DataChannels.ANIMOJI, null, 2, null);
    }
}
