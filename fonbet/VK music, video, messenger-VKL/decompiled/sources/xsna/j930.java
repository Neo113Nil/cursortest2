package xsna;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.dto.common.id.UserId;
import xsna.h2a0;
import xsna.k2a0;
import xsna.k930;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class j930 implements pcs, io.reactivex.rxjava3.core.a0 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j930(Object obj, Object obj2, Object obj3, Object obj4) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        k930 k930Var = (k930) this.b;
        SdkClipVideoFile sdkClipVideoFile = ((k930.a) this.c).d;
        Activity activity = (Activity) this.d;
        FragmentManager fragmentManager = (FragmentManager) this.e;
        if (bundle.getInt("negative_feedback_configure_interests_key") == -1) {
            k930Var.a.c.b(new g930(sdkClipVideoFile));
        } else {
            k930Var.c(sdkClipVideoFile, activity);
        }
        fragmentManager.f("negative_feedback_configure_interests_key");
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(final io.reactivex.rxjava3.core.y yVar) {
        p2a0 p2a0Var = (p2a0) this.b;
        String str = (String) this.c;
        final String str2 = (String) this.d;
        UserId userId = (UserId) this.e;
        FragmentActivity activity = p2a0Var.a.getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            yVar.onSuccess(k2a0.a.a);
            return;
        }
        final FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        supportFragmentManager.l0("req_PhoneActualizationBottomSheet", activity, new pcs() { // from class: xsna.m2a0
            @Override // xsna.pcs
            public final void p(Bundle bundle, String str3) {
                io.reactivex.rxjava3.core.y yVar2 = io.reactivex.rxjava3.core.y.this;
                if (!yVar2.h()) {
                    int i = bundle.getInt("result_type");
                    yVar2.onSuccess(i != 0 ? i != 1 ? i != 2 ? k2a0.a.a : new k2a0.b(str2) : k2a0.a.a : k2a0.c.a);
                }
                supportFragmentManager.f("req_PhoneActualizationBottomSheet");
            }
        });
        yVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.n2a0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                FragmentManager.this.f("req_PhoneActualizationBottomSheet");
            }
        });
        if (supportFragmentManager.H("PhoneActualizationBottomSheet") == null) {
            h2a0.a aVar = new h2a0.a(activity, null);
            aVar.e = "";
            aVar.f = "";
            aVar.g = UserId.d;
            aVar.d.r = 0;
            aVar.p(true);
            aVar.q(true);
            aVar.e = str;
            aVar.f = str2;
            aVar.g = userId;
            cbq.a(aVar);
            aVar.a().Td(supportFragmentManager, "PhoneActualizationBottomSheet");
        }
    }
}
