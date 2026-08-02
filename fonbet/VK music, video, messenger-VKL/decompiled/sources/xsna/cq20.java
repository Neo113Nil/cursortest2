package xsna;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.superapp.pip.impl.view.TouchHandlingFrameLayout;
import com.vkontakte.android.R;

/* compiled from: MiniAppPiPView.kt */
/* loaded from: classes6.dex */
public final class cq20 {
    public final com.vk.movika.sdk.base.logic.processor.actions.e a;
    public final j3 b;

    @SuppressLint({"InflateParams"})
    public final ConstraintLayout c;
    public final View d;
    public final TouchHandlingFrameLayout e;

    public cq20(l7s l7sVar, com.vk.movika.sdk.base.logic.processor.actions.e eVar, j3 j3Var) {
        this.a = eVar;
        this.b = j3Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(l7sVar).inflate(R.layout.mini_app_pip, (ViewGroup) null, false);
        this.c = constraintLayout;
        ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.miniapp_pip_close);
        View findViewById = constraintLayout.findViewById(R.id.miniapp_pip_expand);
        this.d = findViewById;
        this.e = (TouchHandlingFrameLayout) constraintLayout.findViewById(R.id.miniapp_web_view_container);
        bwt0.i0(imageView, new iou(this, 14));
        bwt0.i0(findViewById, new h2s(this, 15));
    }
}
