package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import xsna.xwu0;

/* compiled from: VkCredentialsManager.kt */
/* loaded from: classes.dex */
public interface oou0 {

    /* compiled from: VkCredentialsManager.kt */
    public interface a {
        void a(izs<? super Throwable, s3q0> izsVar, izs<? super VkAuthCredentials, s3q0> izsVar2);
    }

    /* compiled from: VkCredentialsManager.kt */
    public interface b {
        void a(VkAuthCredentials vkAuthCredentials, gzs gzsVar, izs izsVar);
    }

    xwu0.a a(FragmentActivity fragmentActivity, androidx.lifecycle.j jVar);

    xwu0.b b(Context context, androidx.lifecycle.j jVar);
}
