package ru.rustore.sdk.activitylauncher;

/* compiled from: ActivityLauncherResult.kt */
/* loaded from: classes9.dex */
public abstract class a {
    public final int a;

    /* compiled from: ActivityLauncherResult.kt */
    /* renamed from: ru.rustore.sdk.activitylauncher.a$a, reason: collision with other inner class name */
    public static final class C2395a extends a {
        public static final C2395a b = new C2395a(2);
    }

    /* compiled from: ActivityLauncherResult.kt */
    public static final class b extends a {
        public static final b b = new b(0);
    }

    /* compiled from: ActivityLauncherResult.kt */
    public static final class c extends a {
        public static final c b = new c(-1);
    }

    /* compiled from: ActivityLauncherResult.kt */
    public static final class d extends a {
        public final int b;

        public d(int i) {
            super(i);
            this.b = i;
        }

        @Override // ru.rustore.sdk.activitylauncher.a
        public final int a() {
            return this.b;
        }
    }

    /* compiled from: ActivityLauncherResult.kt */
    public static final class e extends a {
        public static final e b = new e(9901);
    }

    /* compiled from: ActivityLauncherResult.kt */
    public static final class f extends a {
        public static final f b = new f(9902);
    }

    public a(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }
}
