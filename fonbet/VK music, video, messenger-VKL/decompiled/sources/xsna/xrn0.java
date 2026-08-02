package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.fragments.FragmentImpl;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.picker.template.ui.StoryTemplateFragment;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;

/* compiled from: TabAdapter.kt */
/* loaded from: classes6.dex */
public final class xrn0 extends k1q0 {
    public final s3t s;
    public final StoryCameraParams t;
    public final Boolean u;

    public xrn0(StoryMediaPickerFragment storyMediaPickerFragment, ViewPager2 viewPager2, mbs mbsVar, s3t s3tVar, StoryCameraParams storyCameraParams, Boolean bool) {
        super(storyMediaPickerFragment, viewPager2, mbsVar, storyMediaPickerFragment.In().a);
        this.s = s3tVar;
        this.t = storyCameraParams;
        this.u = bool;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.scs
    public final Fragment z0(int i) {
        FragmentImpl fragmentImpl;
        if (i == 0) {
            s3t s3tVar = this.s;
            FragmentImpl a = s3tVar.b.a();
            Bundle arguments = a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putAll(s3tVar.a);
            a.setArguments(arguments);
            if ((a instanceof p3t ? (p3t) a : null) != null) {
                if (epx.f(this.u, Boolean.TRUE)) {
                    ((p3t) a).k8(false);
                }
                k15.u((p3t) a, s3tVar);
            }
            fragmentImpl = a;
        } else {
            if (i != 1) {
                throw new IllegalArgumentException(lhg.a(i, "Invalid position "));
            }
            StoryTemplateFragment.a aVar = new StoryTemplateFragment.a(StoryTemplateFragment.class, null, null);
            aVar.j.putParcelable("camera_params", this.t);
            fragmentImpl = aVar.f();
        }
        G0(fragmentImpl, i);
        return fragmentImpl;
    }
}
