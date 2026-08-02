package xsna;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;

/* compiled from: VectorDrawableParser.kt */
/* loaded from: classes6.dex */
public final class flr0 {
    public static final fy2 a = new fy2();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VectorDrawableParser.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CLIP_PATH;
        public static final C2882a Companion;
        public static final a GROUP;
        public static final a PATH;
        public static final a VECTOR;
        private final String tag;

        /* compiled from: VectorDrawableParser.kt */
        /* renamed from: xsna.flr0$a$a, reason: collision with other inner class name */
        public static final class C2882a {
        }

        static {
            a aVar = new a("VECTOR", 0, "vector");
            VECTOR = aVar;
            a aVar2 = new a("GROUP", 1, "group");
            GROUP = aVar2;
            a aVar3 = new a(AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH, 2, "path");
            PATH = aVar3;
            a aVar4 = new a("CLIP_PATH", 3, "clip-path");
            CLIP_PATH = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
            Companion = new C2882a();
        }

        public a(String str, int i, String str2) {
            this.tag = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final String h() {
            return this.tag;
        }
    }

    /* compiled from: VectorDrawableParser.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.VECTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.PATH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.CLIP_PATH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
