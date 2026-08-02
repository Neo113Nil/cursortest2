package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.dto.common.VerifyInfo;

/* compiled from: SpectatorsContract.java */
/* loaded from: classes3.dex */
public interface wjk0 extends rr6<vjk0> {

    /* compiled from: SpectatorsContract.java */
    public static class a {

        @Nullable
        public final String a;

        @NonNull
        public final String b;

        @NonNull
        public final String c;

        @Nullable
        public final String d;

        @Nullable
        public final VerifyInfo e;

        public a(@Nullable String str, @NonNull String str2, @NonNull String str3, @Nullable String str4, boolean z, @Nullable VerifyInfo verifyInfo) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = verifyInfo;
        }
    }

    void T1(boolean z);

    void X();

    void Y(boolean z, boolean z2);

    void Y2();

    void setCurrentViewers(int i);

    void setTimeText(int i);

    void setUser(a aVar);

    void v2(int i, boolean z);

    default void Q3() {
    }
}
