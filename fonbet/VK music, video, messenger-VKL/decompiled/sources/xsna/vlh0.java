package xsna;

import androidx.compose.runtime.a;

/* compiled from: Search.kt */
/* loaded from: classes17.dex */
public final class vlh0 {
    public static lkg0 a(int i, int i2, androidx.compose.runtime.a aVar, com.vk.core.compose.component.semantics.a aVar2, String str, gzs gzsVar) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            aVar2 = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-874675676, i, -1, "com.vk.core.compose.component.search.Search.Right.Voice.Microphone.Companion.invoke (Search.kt:116)");
        }
        int i3 = (i >> 9) & 14;
        int i4 = i << 3;
        int i5 = (i4 & 7168) | i3 | (i4 & 112) | (i4 & 896);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1821418587, i5, -1, "com.vk.core.compose.component.search.remember (RightMicrophoneImpl.kt:43)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new lkg0(aVar2, str, gzsVar);
            aVar.R(x);
        }
        lkg0 lkg0Var = (lkg0) x;
        ((zak0) lkg0Var.a).setValue(str);
        ((zak0) lkg0Var.b).setValue(gzsVar);
        ((zak0) lkg0Var.c).setValue(aVar2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return lkg0Var;
    }
}
