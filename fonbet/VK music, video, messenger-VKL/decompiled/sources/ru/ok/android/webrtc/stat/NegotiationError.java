package ru.ok.android.webrtc.stat;

import kotlin.NoWhenBranchMatchedException;
import org.webrtc.SessionDescription;
import xsna.asp;
import xsna.e43;
import xsna.j5g;
import xsna.zcl;
import xsna.zrp;

/* loaded from: classes9.dex */
public final class NegotiationError {
    public final Type a;
    public final String b;
    public final SessionDescription c;
    public final SessionDescription d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type CREATE_ANSWER;
        public static final Type CREATE_OFFER;
        public static final Companion Companion;
        public static final Type SET_LOCAL_ANSWER;
        public static final Type SET_LOCAL_OFFER;
        public static final Type SET_LOCAL_PRANSWER;
        public static final Type SET_LOCAL_ROLLBACK;
        public static final Type SET_REMOTE_ANSWER;
        public static final Type SET_REMOTE_OFFER;
        public static final Type SET_REMOTE_PRANSWER;
        public static final Type SET_REMOTE_ROLLBACK;
        public static final /* synthetic */ Type[] a;
        public static final /* synthetic */ zrp b;

        public static final class Companion {

            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                static {
                    int[] iArr = new int[SessionDescription.Type.values().length];
                    try {
                        iArr[SessionDescription.Type.OFFER.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SessionDescription.Type.PRANSWER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SessionDescription.Type.ANSWER.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[SessionDescription.Type.ROLLBACK.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[Type.values().length];
                    try {
                        iArr2[Type.CREATE_OFFER.ordinal()] = 1;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr2[Type.SET_LOCAL_OFFER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr2[Type.SET_REMOTE_OFFER.ordinal()] = 3;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr2[Type.CREATE_ANSWER.ordinal()] = 4;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr2[Type.SET_LOCAL_ANSWER.ordinal()] = 5;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr2[Type.SET_REMOTE_ANSWER.ordinal()] = 6;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr2[Type.SET_LOCAL_PRANSWER.ordinal()] = 7;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr2[Type.SET_REMOTE_PRANSWER.ordinal()] = 8;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr2[Type.SET_LOCAL_ROLLBACK.ordinal()] = 9;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr2[Type.SET_REMOTE_ROLLBACK.ordinal()] = 10;
                    } catch (NoSuchFieldError unused14) {
                    }
                    $EnumSwitchMapping$1 = iArr2;
                }
            }

            public Companion(zcl zclVar) {
            }

            public final Type from(SessionDescription.Type type, boolean z) {
                int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                if (i == 1) {
                    return z ? Type.SET_LOCAL_OFFER : Type.SET_REMOTE_OFFER;
                }
                if (i == 2) {
                    return z ? Type.SET_LOCAL_PRANSWER : Type.SET_REMOTE_PRANSWER;
                }
                if (i == 3) {
                    return z ? Type.SET_LOCAL_ANSWER : Type.SET_REMOTE_ANSWER;
                }
                if (i == 4) {
                    return z ? Type.SET_LOCAL_ROLLBACK : Type.SET_REMOTE_ROLLBACK;
                }
                throw new NoWhenBranchMatchedException();
            }

            public final boolean isOneOfSetLocal(Type type) {
                return j5g.P(e43.l(Type.SET_LOCAL_OFFER, Type.SET_LOCAL_ANSWER, Type.SET_LOCAL_PRANSWER, Type.SET_LOCAL_ROLLBACK), type);
            }

            public final boolean isOneOfSetRemote(Type type) {
                return j5g.P(e43.l(Type.SET_REMOTE_OFFER, Type.SET_REMOTE_ANSWER, Type.SET_REMOTE_PRANSWER, Type.SET_REMOTE_ROLLBACK), type);
            }

            public final SessionDescription.Type mapToSdpType(Type type) {
                switch (WhenMappings.$EnumSwitchMapping$1[type.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        return SessionDescription.Type.OFFER;
                    case 4:
                    case 5:
                    case 6:
                        return SessionDescription.Type.ANSWER;
                    case 7:
                    case 8:
                        return SessionDescription.Type.PRANSWER;
                    case 9:
                    case 10:
                        return SessionDescription.Type.ROLLBACK;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        static {
            Type type = new Type("CREATE_OFFER", 0);
            CREATE_OFFER = type;
            Type type2 = new Type("CREATE_ANSWER", 1);
            CREATE_ANSWER = type2;
            Type type3 = new Type("SET_LOCAL_OFFER", 2);
            SET_LOCAL_OFFER = type3;
            Type type4 = new Type("SET_REMOTE_OFFER", 3);
            SET_REMOTE_OFFER = type4;
            Type type5 = new Type("SET_LOCAL_ANSWER", 4);
            SET_LOCAL_ANSWER = type5;
            Type type6 = new Type("SET_REMOTE_ANSWER", 5);
            SET_REMOTE_ANSWER = type6;
            Type type7 = new Type("SET_LOCAL_PRANSWER", 6);
            SET_LOCAL_PRANSWER = type7;
            Type type8 = new Type("SET_REMOTE_PRANSWER", 7);
            SET_REMOTE_PRANSWER = type8;
            Type type9 = new Type("SET_LOCAL_ROLLBACK", 8);
            SET_LOCAL_ROLLBACK = type9;
            Type type10 = new Type("SET_REMOTE_ROLLBACK", 9);
            SET_REMOTE_ROLLBACK = type10;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10};
            a = typeArr;
            b = new asp(typeArr);
            Companion = new Companion(null);
        }

        public Type(String str, int i) {
        }

        public static final Type from(SessionDescription.Type type, boolean z) {
            return Companion.from(type, z);
        }

        public static zrp<Type> getEntries() {
            return b;
        }

        public static final boolean isOneOfSetLocal(Type type) {
            return Companion.isOneOfSetLocal(type);
        }

        public static final boolean isOneOfSetRemote(Type type) {
            return Companion.isOneOfSetRemote(type);
        }

        public static final SessionDescription.Type mapToSdpType(Type type) {
            return Companion.mapToSdpType(type);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) a.clone();
        }
    }

    public NegotiationError(Type type, String str, SessionDescription sessionDescription, SessionDescription sessionDescription2) {
        this.a = type;
        this.b = str;
        this.c = sessionDescription;
        this.d = sessionDescription2;
    }

    public final SessionDescription getLocalSdp() {
        return this.c;
    }

    public final String getMessage() {
        return this.b;
    }

    public final SessionDescription getRemoteSdp() {
        return this.d;
    }

    public final Type getType() {
        return this.a;
    }

    public /* synthetic */ NegotiationError(Type type, String str, SessionDescription sessionDescription, SessionDescription sessionDescription2, int i, zcl zclVar) {
        this(type, str, (i & 4) != 0 ? null : sessionDescription, (i & 8) != 0 ? null : sessionDescription2);
    }
}
