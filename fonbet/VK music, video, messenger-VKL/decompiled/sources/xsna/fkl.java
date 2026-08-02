package xsna;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.lists.AbstractPaginatedView;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.posting.data.PickerTechMetricsSession;

/* compiled from: DefaultPickerTechMetricsCollector.kt */
/* loaded from: classes3.dex */
public final class fkl {
    public Long a;
    public Long b;

    /* compiled from: DefaultPickerTechMetricsCollector.kt */
    public static final class a implements AbstractPaginatedView.e {
        public final BasePhotoListFragment b;
        public final b1a c;
        public int d = -1;
        public boolean e;

        public a(BasePhotoListFragment basePhotoListFragment, b1a b1aVar) {
            this.b = basePhotoListFragment;
            this.c = b1aVar;
        }

        @Override // com.vk.lists.AbstractPaginatedView.e
        public final void b(int i) {
            if (this.d != i) {
                this.d = i;
                if (i != 8 || this.e) {
                    return;
                }
                this.e = true;
                this.c.invoke(this.b);
            }
        }
    }

    public fkl() {
        new io.reactivex.rxjava3.disposables.b();
    }

    public final void a(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("PICKER_TECH_METRICS_SESSION", PickerTechMetricsSession.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("PICKER_TECH_METRICS_SESSION");
            if (!(parcelable3 instanceof PickerTechMetricsSession)) {
                parcelable3 = null;
            }
            parcelable = (PickerTechMetricsSession) parcelable3;
        }
        PickerTechMetricsSession pickerTechMetricsSession = (PickerTechMetricsSession) parcelable;
        if (pickerTechMetricsSession == null) {
            return;
        }
        this.a = pickerTechMetricsSession.b;
        this.b = pickerTechMetricsSession.c;
    }

    public final void b(BasePhotoListFragment basePhotoListFragment) {
        if (basePhotoListFragment.A != 0) {
            return;
        }
        Fragment parentFragment = basePhotoListFragment.getParentFragment();
        FragmentImpl fragmentImpl = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
        if (fragmentImpl == null || fragmentImpl.A != 0) {
            return;
        }
        Intent intent = fragmentImpl.B;
        if (intent == null) {
            intent = new Intent();
            fragmentImpl.B = intent;
        }
        c(intent);
        fragmentImpl.setResult(0, intent);
    }

    public final void c(Intent intent) {
        intent.putExtra("PICKER_TECH_METRICS_SESSION", new PickerTechMetricsSession(this.a, this.b));
    }
}
