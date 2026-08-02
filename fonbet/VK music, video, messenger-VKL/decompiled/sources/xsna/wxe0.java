package xsna;

import androidx.compose.runtime.a;

/* compiled from: RatingBlock.kt */
/* loaded from: classes18.dex */
public interface wxe0 {

    /* compiled from: RatingBlock.kt */
    public static final class a {
        public static ga70 a(String str, gzs gzsVar, androidx.compose.runtime.a aVar) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-901632682, 3072, -1, "com.vk.ecomm.design.compose.ratingblock.RatingBlock.Notification.Companion.invoke (RatingBlock.kt:64)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1937852065, 6, -1, "com.vk.ecomm.design.compose.ratingblock.remember (NotificationImpl.kt:78)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new ga70(str, gzsVar);
                aVar.R(x);
            }
            ga70 ga70Var = (ga70) x;
            ((zak0) ga70Var.a).setValue(new xxe0(str));
            ((zak0) ga70Var.b).setValue(gzsVar);
            ((zak0) ga70Var.c).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return ga70Var;
        }
    }

    void a(int i, androidx.compose.runtime.a aVar);
}
