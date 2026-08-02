package xsna;

import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import com.vk.log.L;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import xsna.r100;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class krw implements io.reactivex.rxjava3.core.a0, Preference.c, yads.ng1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ krw(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.b;
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.c;
        int i = SettingsGeneralFragment.z0;
        if (!((SwitchPreferenceCompat) preference).Q || !settingsGeneralFragment.w0.c()) {
            return true;
        }
        switchPreferenceCompat.O(false);
        settingsGeneralFragment.p0.a(settingsGeneralFragment.requireContext(), null, null, null);
        return true;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(final io.reactivex.rxjava3.core.y yVar) {
        final mrw mrwVar = (mrw) this.b;
        ReviewInfo reviewInfo = (ReviewInfo) this.c;
        r100.a(mrwVar.g, "Launching review flow");
        com.google.android.play.core.review.b bVar = mrwVar.c;
        if (bVar == null) {
            bVar = null;
        }
        Task<Void> a = bVar.a(mrwVar.a, reviewInfo);
        final dkg dkgVar = new dkg(mrwVar, 23);
        a.addOnSuccessListener(new OnSuccessListener() { // from class: xsna.lrw
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                dkg.this.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: xsna.drw
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                L.l("InAppReview", fo8.a(mrw.this.g, ": Review flow error"), mnh0.A(new r100.a("InAppReviewException", exc)));
                ReviewException reviewException = exc instanceof ReviewException ? (ReviewException) exc : null;
                yVar.onError(reviewException != null ? mrw.a(reviewException) : null);
            }
        }).addOnCanceledListener(new OnCanceledListener() { // from class: xsna.erw
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                r100.a(mrw.this.g, "Review flow canceled");
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: xsna.frw
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                String str = mrw.this.g;
                Exception exception = task.getException();
                String a2 = fo8.a(str, ": Review flow completed");
                if (exception != null) {
                    L.l("InAppReview", a2, mnh0.A(new r100.a("InAppReviewException", exception)));
                } else {
                    L.e("InAppReview", a2);
                }
                boolean isSuccessful = task.isSuccessful();
                io.reactivex.rxjava3.core.y yVar2 = yVar;
                if (isSuccessful) {
                    yVar2.onSuccess(new hgg0(null));
                    return;
                }
                Exception exception2 = task.getException();
                ReviewException reviewException = exception2 instanceof ReviewException ? (ReviewException) exception2 : null;
                yVar2.onError(reviewException != null ? mrw.a(reviewException) : null);
            }
        });
    }
}
