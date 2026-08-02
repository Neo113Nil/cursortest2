package ru.ok.android.externcalls.sdk.stat;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.externcalls.sdk.stat.SimpleKeyProp;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.camera.CameraStat;
import xsna.an10;
import xsna.b09;
import xsna.fpf0;
import xsna.gzs;
import xsna.j7e0;
import xsna.msy;
import xsna.pzl;
import xsna.qcy;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class Camera extends StatGroup {
    static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
    public static final Camera INSTANCE;
    private static final KeyProp fps$delegate;
    private static final KeyProp frameSize$delegate;

    static {
        qcy<?>[] qcyVarArr = {new PropertyReference1Impl(Camera.class, "fps", "getFps()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), b09.a(0, Camera.class, "frameSize", "getFrameSize()Lru/ok/android/externcalls/sdk/stat/StatKey;", fpf0.a)};
        $$delegatedProperties = qcyVarArr;
        Camera camera = new Camera();
        INSTANCE = camera;
        final KeyPropBehavior keyPropBehavior = new KeyPropBehavior(false, false, false, false, true, 13, null);
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        fps$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Camera$special$$inlined$camera$1

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Camera$special$$inlined$camera$1$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Float>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Camera$special$.inlined.camera.1.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Float doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    if (statPack.getCameraStat() != null) {
                        return Float.valueOf(an10.b(r1.getFps() * 1000) / 1000.0f);
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

            public final SimpleKeyProp<Float> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                SimpleKeyProp<Float> simpleKeyProp = new SimpleKeyProp<>(null);
                simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                return simpleKeyProp;
            }
        }.provideDelegate(camera, qcyVarArr[0]);
        final KeyPropBehavior keyPropBehavior2 = new KeyPropBehavior(false, false, false, false, true, 13, null);
        frameSize$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Camera$special$$inlined$camera$2

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Camera$special$$inlined$camera$2$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Camera$special$.inlined.camera.2.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    CameraStat cameraStat = statPack.getCameraStat();
                    if (cameraStat == null) {
                        return null;
                    }
                    return cameraStat.getFrameWidth() + "x" + cameraStat.getFrameHeight();
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
        }.provideDelegate(camera, qcyVarArr[1]);
    }

    private Camera() {
        super(SignalingProtocol.KEY_CAMERA, null, 2, null);
    }

    public final StatKey<Float> getFps() {
        return (StatKey) fps$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final StatKey<String> getFrameSize() {
        return (StatKey) frameSize$delegate.getValue(this, $$delegatedProperties[1]);
    }
}
