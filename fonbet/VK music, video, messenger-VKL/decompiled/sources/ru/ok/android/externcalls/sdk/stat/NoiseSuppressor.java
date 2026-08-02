package ru.ok.android.externcalls.sdk.stat;

import com.ironsource.V5;
import com.ironsource.X3;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.stat.SimpleKeyProp;
import ru.ok.android.webrtc.noisesuppressor.NoiseSuppressorActiveState;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.b09;
import xsna.drm0;
import xsna.fpf0;
import xsna.gzs;
import xsna.j7e0;
import xsna.msy;
import xsna.pzl;
import xsna.qcy;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class NoiseSuppressor extends StatGroup {
    static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
    public static final NoiseSuppressor INSTANCE;
    private static final KeyProp clientsideAnn$delegate;
    private static final KeyProp clientsidePlatform$delegate;
    private static final KeyProp enhancerKind$delegate;
    private static final KeyProp fallbackStutterCountMillis$delegate;
    private static final KeyProp fallbackTimeLimitMillis$delegate;
    private static final KeyProp fallbackTimeframeMillis$delegate;
    private static final KeyProp filePath$delegate;
    private static final KeyProp inputSampleRate$delegate;
    private static final KeyProp noiseSuppressorStuttering$delegate;
    private static final KeyProp outputSampleRate$delegate;
    private static final KeyProp serversideAnn$delegate;
    private static final KeyProp serversideBasic$delegate;

    /* compiled from: Stats.kt */
    public static final class Pretty extends StatGroup {
        static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
        public static final Pretty INSTANCE;
        private static final KeyProp activeTypes$delegate;
        private static final KeyProp fallback$delegate;
        private static final KeyProp localMl$delegate;
        private static final KeyProp stuttering$delegate;

        static {
            qcy<?>[] qcyVarArr = {new PropertyReference1Impl(Pretty.class, "stuttering", "getStuttering()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), b09.a(0, Pretty.class, "activeTypes", "getActiveTypes()Lru/ok/android/externcalls/sdk/stat/StatKey;", fpf0.a), new PropertyReference1Impl(Pretty.class, "localMl", "getLocalMl()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Pretty.class, "fallback", "getFallback()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0)};
            $$delegatedProperties = qcyVarArr;
            Pretty pretty = new Pretty();
            INSTANCE = pretty;
            StatKey<Boolean> noiseSuppressorStuttering = NoiseSuppressor.INSTANCE.getNoiseSuppressorStuttering();
            KeyPropBehavior keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            stuttering$delegate = (KeyProp) new StatsKt$forward$$inlined$derive$1(KeyPropBehavior.copy$default(keyPropBehavior, false, false, true, false, false, 27, null), noiseSuppressorStuttering).provideDelegate((StatsKt$forward$$inlined$derive$1) pretty, qcyVarArr[0]);
            final KeyPropBehavior keyPropBehavior2 = new KeyPropBehavior(false, false, true, false, false, 27, null);
            activeTypes$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$Pretty$special$$inlined$keyCreator$calls_sdk_stat_release$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$Pretty$special$$inlined$keyCreator$calls_sdk_stat_release$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$Pretty$special$.inlined.keyCreator.calls_sdk_stat_release.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        NoiseSuppressor noiseSuppressor = NoiseSuppressor.INSTANCE;
                        return "server: [basic: " + noiseSuppressor.getServersideBasic().extract(statPack, innerExtractionContext).getValue() + ", ann: " + noiseSuppressor.getServersideAnn().extract(statPack, innerExtractionContext).getValue() + "], client: [platform: " + noiseSuppressor.getClientsidePlatform().extract(statPack, innerExtractionContext).getValue() + ", ml: " + noiseSuppressor.getClientsideAnn().extract(statPack, innerExtractionContext).getValue() + X3.j.e;
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
            }.provideDelegate(pretty, qcyVarArr[1]);
            final KeyPropBehavior keyPropBehavior3 = new KeyPropBehavior(false, false, true, false, false, 27, null);
            localMl$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$Pretty$special$$inlined$keyCreator$calls_sdk_stat_release$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$Pretty$special$$inlined$keyCreator$calls_sdk_stat_release$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$Pretty$special$.inlined.keyCreator.calls_sdk_stat_release.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        NoiseSuppressor noiseSuppressor = NoiseSuppressor.INSTANCE;
                        String value = noiseSuppressor.getEnhancerKind().extract(statPack, innerExtractionContext).getValue();
                        if (value == null) {
                            return "none";
                        }
                        String value2 = noiseSuppressor.getFilePath().extract(statPack, innerExtractionContext).getValue();
                        if (value2 != null) {
                            int P = drm0.P(value2, File.separatorChar, 0, 6);
                            if (P != -1) {
                                value2 = value2.substring(P);
                            }
                        } else {
                            value2 = null;
                        }
                        return "kind: " + value + ", inputSR: " + noiseSuppressor.getInputSampleRate().extract(statPack, innerExtractionContext).getValue() + ", outputSR: " + noiseSuppressor.getOutputSampleRate().extract(statPack, innerExtractionContext).getValue() + ", file: " + value2;
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
            }.provideDelegate(pretty, qcyVarArr[2]);
            final KeyPropBehavior keyPropBehavior4 = new KeyPropBehavior(false, false, true, false, false, 27, null);
            fallback$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$Pretty$special$$inlined$keyCreator$calls_sdk_stat_release$3

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$Pretty$special$$inlined$keyCreator$calls_sdk_stat_release$3$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$Pretty$special$.inlined.keyCreator.calls_sdk_stat_release.3.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        NoiseSuppressor noiseSuppressor = NoiseSuppressor.INSTANCE;
                        if (noiseSuppressor.getEnhancerKind().extract(statPack, innerExtractionContext).getValue() == null) {
                            return "none";
                        }
                        return "timelimit: " + noiseSuppressor.getFallbackTimeLimitMillis().extract(statPack, innerExtractionContext).getValue() + ", stutters: " + noiseSuppressor.getFallbackStutterCountMillis().extract(statPack, innerExtractionContext).getValue() + ", timeframe: " + noiseSuppressor.getFallbackTimeframeMillis().extract(statPack, innerExtractionContext).getValue();
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
            }.provideDelegate(pretty, qcyVarArr[3]);
        }

        private Pretty() {
            super("pretty", NoiseSuppressor.INSTANCE, null);
        }

        public final StatKey<String> getActiveTypes() {
            return (StatKey) activeTypes$delegate.getValue(this, $$delegatedProperties[1]);
        }

        public final StatKey<String> getFallback() {
            return (StatKey) fallback$delegate.getValue(this, $$delegatedProperties[3]);
        }

        public final StatKey<String> getLocalMl() {
            return (StatKey) localMl$delegate.getValue(this, $$delegatedProperties[2]);
        }

        public final StatKey<Boolean> getStuttering() {
            return (StatKey) stuttering$delegate.getValue(this, $$delegatedProperties[0]);
        }
    }

    static {
        qcy<?>[] qcyVarArr = {new PropertyReference1Impl(NoiseSuppressor.class, "noiseSuppressorStuttering", "getNoiseSuppressorStuttering()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), b09.a(0, NoiseSuppressor.class, "serversideBasic", "getServersideBasic()Lru/ok/android/externcalls/sdk/stat/StatKey;", fpf0.a), new PropertyReference1Impl(NoiseSuppressor.class, "serversideAnn", "getServersideAnn()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(NoiseSuppressor.class, "clientsidePlatform", "getClientsidePlatform()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(NoiseSuppressor.class, "clientsideAnn", "getClientsideAnn()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(NoiseSuppressor.class, "enhancerKind", "getEnhancerKind()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(NoiseSuppressor.class, V5.c.c, "getFilePath()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(NoiseSuppressor.class, "inputSampleRate", "getInputSampleRate()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(NoiseSuppressor.class, "outputSampleRate", "getOutputSampleRate()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(NoiseSuppressor.class, "fallbackTimeLimitMillis", "getFallbackTimeLimitMillis()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(NoiseSuppressor.class, "fallbackStutterCountMillis", "getFallbackStutterCountMillis()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(NoiseSuppressor.class, "fallbackTimeframeMillis", "getFallbackTimeframeMillis()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0)};
        $$delegatedProperties = qcyVarArr;
        NoiseSuppressor noiseSuppressor = new NoiseSuppressor();
        INSTANCE = noiseSuppressor;
        final KeyPropBehavior keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        noiseSuppressorStuttering$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$1

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$1$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Boolean>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$.inlined.ns.default.1.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Boolean doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    NoiseSuppressorActiveState noiseSuppressorState = statPack.getNoiseSuppressorState();
                    if (noiseSuppressorState != null) {
                        return Boolean.valueOf(noiseSuppressorState.getNoiseSuppressorStuttering());
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
        }.provideDelegate(noiseSuppressor, qcyVarArr[0]);
        final KeyPropBehavior keyPropBehavior2 = new KeyPropBehavior(false, false, false, false, false, 31, null);
        serversideBasic$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$2

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$2$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Boolean>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$.inlined.ns.default.2.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Boolean doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    NoiseSuppressorActiveState noiseSuppressorState = statPack.getNoiseSuppressorState();
                    if (noiseSuppressorState != null) {
                        return Boolean.valueOf(noiseSuppressorState.getServersideBasic());
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
        }.provideDelegate(noiseSuppressor, qcyVarArr[1]);
        final KeyPropBehavior keyPropBehavior3 = new KeyPropBehavior(false, false, false, false, false, 31, null);
        serversideAnn$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$3

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$3$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Boolean>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$.inlined.ns.default.3.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Boolean doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    NoiseSuppressorActiveState noiseSuppressorState = statPack.getNoiseSuppressorState();
                    if (noiseSuppressorState != null) {
                        return Boolean.valueOf(noiseSuppressorState.getServersideAnn());
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
        }.provideDelegate(noiseSuppressor, qcyVarArr[2]);
        final KeyPropBehavior keyPropBehavior4 = new KeyPropBehavior(false, false, false, false, false, 31, null);
        clientsidePlatform$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$4

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$4$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Boolean>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$.inlined.ns.default.4.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Boolean doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    NoiseSuppressorActiveState noiseSuppressorState = statPack.getNoiseSuppressorState();
                    if (noiseSuppressorState != null) {
                        return Boolean.valueOf(noiseSuppressorState.getClientsidePlatform());
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
        }.provideDelegate(noiseSuppressor, qcyVarArr[3]);
        final KeyPropBehavior keyPropBehavior5 = new KeyPropBehavior(false, false, false, false, false, 31, null);
        clientsideAnn$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$5

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$5$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Boolean>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$.inlined.ns.default.5.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Boolean doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    NoiseSuppressorActiveState noiseSuppressorState = statPack.getNoiseSuppressorState();
                    if (noiseSuppressorState != null) {
                        return Boolean.valueOf(noiseSuppressorState.getClientsideAnn());
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
        }.provideDelegate(noiseSuppressor, qcyVarArr[4]);
        final KeyPropBehavior keyPropBehavior6 = new KeyPropBehavior(false, false, false, false, false, 31, null);
        enhancerKind$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$6

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$6$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$.inlined.ns.default.6.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    PeerConnectionFactory.EnhancerKind enhancerKind;
                    NoiseSuppressorActiveState noiseSuppressorState = statPack.getNoiseSuppressorState();
                    if (noiseSuppressorState == null || (enhancerKind = noiseSuppressorState.getEnhancerKind()) == null) {
                        return null;
                    }
                    return enhancerKind.toString();
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
        }.provideDelegate(noiseSuppressor, qcyVarArr[5]);
        final KeyPropBehavior keyPropBehavior7 = new KeyPropBehavior(false, false, false, false, false, 31, null);
        filePath$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$7

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$7$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$.inlined.ns.default.7.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    NoiseSuppressorActiveState noiseSuppressorState = statPack.getNoiseSuppressorState();
                    if (noiseSuppressorState != null) {
                        return noiseSuppressorState.getFilePath();
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
        }.provideDelegate(noiseSuppressor, qcyVarArr[6]);
        final KeyPropBehavior keyPropBehavior8 = new KeyPropBehavior(false, false, false, false, false, 31, null);
        inputSampleRate$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$8

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$8$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$.inlined.ns.default.8.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    NoiseSuppressorActiveState noiseSuppressorState = statPack.getNoiseSuppressorState();
                    if (noiseSuppressorState != null) {
                        return Integer.valueOf(noiseSuppressorState.getInputSampleRate());
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
        }.provideDelegate(noiseSuppressor, qcyVarArr[7]);
        final KeyPropBehavior keyPropBehavior9 = new KeyPropBehavior(false, false, false, false, false, 31, null);
        outputSampleRate$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$9

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$9$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$.inlined.ns.default.9.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    NoiseSuppressorActiveState noiseSuppressorState = statPack.getNoiseSuppressorState();
                    if (noiseSuppressorState != null) {
                        return Integer.valueOf(noiseSuppressorState.getOutputSampleRate());
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
        }.provideDelegate(noiseSuppressor, qcyVarArr[8]);
        final KeyPropBehavior keyPropBehavior10 = new KeyPropBehavior(false, false, false, false, false, 31, null);
        fallbackTimeLimitMillis$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$10

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$10$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$.inlined.ns.default.10.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    NoiseSuppressorActiveState noiseSuppressorState = statPack.getNoiseSuppressorState();
                    if (noiseSuppressorState != null) {
                        return Integer.valueOf(noiseSuppressorState.getFallbackTimeLimitMillis());
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
        }.provideDelegate(noiseSuppressor, qcyVarArr[9]);
        final KeyPropBehavior keyPropBehavior11 = new KeyPropBehavior(false, false, false, false, false, 31, null);
        fallbackStutterCountMillis$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$11

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$11$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$.inlined.ns.default.11.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    NoiseSuppressorActiveState noiseSuppressorState = statPack.getNoiseSuppressorState();
                    if (noiseSuppressorState != null) {
                        return Integer.valueOf(noiseSuppressorState.getFallbackStutterCountMillis());
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
        }.provideDelegate(noiseSuppressor, qcyVarArr[10]);
        final KeyPropBehavior keyPropBehavior12 = new KeyPropBehavior(false, false, false, false, false, 31, null);
        fallbackTimeframeMillis$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$12

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$$inlined$ns$default$12$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.NoiseSuppressor$special$.inlined.ns.default.12.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    NoiseSuppressorActiveState noiseSuppressorState = statPack.getNoiseSuppressorState();
                    if (noiseSuppressorState != null) {
                        return Integer.valueOf(noiseSuppressorState.getFallbackTimeframeMillis());
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
        }.provideDelegate(noiseSuppressor, qcyVarArr[11]);
    }

    private NoiseSuppressor() {
        super(UcumUtils.UCUM_NANOSECONDS, null, 2, null);
    }

    public final StatKey<Boolean> getClientsideAnn() {
        return (StatKey) clientsideAnn$delegate.getValue(this, $$delegatedProperties[4]);
    }

    public final StatKey<Boolean> getClientsidePlatform() {
        return (StatKey) clientsidePlatform$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public final StatKey<String> getEnhancerKind() {
        return (StatKey) enhancerKind$delegate.getValue(this, $$delegatedProperties[5]);
    }

    public final StatKey<Integer> getFallbackStutterCountMillis() {
        return (StatKey) fallbackStutterCountMillis$delegate.getValue(this, $$delegatedProperties[10]);
    }

    public final StatKey<Integer> getFallbackTimeLimitMillis() {
        return (StatKey) fallbackTimeLimitMillis$delegate.getValue(this, $$delegatedProperties[9]);
    }

    public final StatKey<Integer> getFallbackTimeframeMillis() {
        return (StatKey) fallbackTimeframeMillis$delegate.getValue(this, $$delegatedProperties[11]);
    }

    public final StatKey<String> getFilePath() {
        return (StatKey) filePath$delegate.getValue(this, $$delegatedProperties[6]);
    }

    public final StatKey<Integer> getInputSampleRate() {
        return (StatKey) inputSampleRate$delegate.getValue(this, $$delegatedProperties[7]);
    }

    public final StatKey<Boolean> getNoiseSuppressorStuttering() {
        return (StatKey) noiseSuppressorStuttering$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final StatKey<Integer> getOutputSampleRate() {
        return (StatKey) outputSampleRate$delegate.getValue(this, $$delegatedProperties[8]);
    }

    public final StatKey<Boolean> getServersideAnn() {
        return (StatKey) serversideAnn$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public final StatKey<Boolean> getServersideBasic() {
        return (StatKey) serversideBasic$delegate.getValue(this, $$delegatedProperties[1]);
    }
}
