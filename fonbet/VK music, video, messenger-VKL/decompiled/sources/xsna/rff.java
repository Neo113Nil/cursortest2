package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.yandex.div.core.expression.local.ExpressionsRuntimeProvider;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.evaluable.StoredValueProvider;
import java.util.List;
import xsna.lbf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class rff implements pcs, StoredValueProvider, io.reactivex.rxjava3.core.d, c680, yads.ng1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rff(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    public Object a(String str) {
        Object createRootRuntime$lambda$0;
        createRootRuntime$lambda$0 = ExpressionsRuntimeProvider.createRootRuntime$lambda$0((ExpressionsRuntimeProvider) this.b, (ErrorCollector) this.c, str);
        return createRootRuntime$lambda$0;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }

    @Override // xsna.c680
    public void onFailure(Exception exc) {
        ((com.my.tracker.obfuscated.d) this.b).a((List) this.c, exc);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) this.b;
        hjf hjfVar = (hjf) this.c;
        String str2 = ClipsUploadFragmentImpl.a0;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("cta_result", ClipInvolvementActionButton.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("cta_result");
            if (!(parcelable3 instanceof ClipInvolvementActionButton)) {
                parcelable3 = null;
            }
            parcelable = (ClipInvolvementActionButton) parcelable3;
        }
        hjfVar.b(new lbf.c.a.e((ClipInvolvementActionButton) parcelable));
        clipsUploadFragmentImpl.getParentFragmentManager().f("cta_request");
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(final io.reactivex.rxjava3.core.b bVar) {
        final e3u e3uVar = (e3u) this.b;
        final wrw wrwVar = (wrw) this.c;
        e3uVar.d.l("complete gms update:" + wrwVar);
        com.vk.metrics.eventtracking.b.a.m(Long.valueOf(wrwVar.b), "CRUCIAL.UPDATE", "version");
        Task<Void> e = e3uVar.g().e();
        final ozh ozhVar = new ozh(bVar, 20);
        e.addOnSuccessListener(new OnSuccessListener() { // from class: xsna.x2u
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ozh.this.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: xsna.y2u
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                e3u.this.d.l("fail to update from gms:" + wrwVar);
                bVar.onError(exc);
            }
        });
    }
}
