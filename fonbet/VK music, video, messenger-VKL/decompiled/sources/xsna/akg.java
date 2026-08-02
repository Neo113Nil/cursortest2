package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ironsource.X3;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.attachpicker.fragment.MediaPickerFragmentImpl;
import com.vk.attachpicker.impl.PhotoEditorActivity;
import com.vk.avatarchange.AvatarChangeActivity;
import com.vk.avatarchange.AvatarChangeCropFragment;
import com.vk.photos.legacy.PhotosFragment;
import com.vkontakte.android.R;
import java.io.File;
import xsna.sw50;

/* compiled from: CommonGalleryPickerImpl.kt */
/* loaded from: classes7.dex */
public final class akg implements sw50.d {
    @Override // xsna.sw50.d
    public final void a(Context context, wzs<? super Integer, ? super Intent, s3q0> wzsVar, int i, izs<? super Intent, s3q0> izsVar) {
        Intent intent = new Intent(context, (Class<?>) PhotoVideoAttachActivity.class);
        izsVar.invoke(intent);
        wzsVar.invoke(Integer.valueOf(i), intent);
    }

    @Override // xsna.sw50.d
    public final void b(Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("select", true);
        bundle.putBoolean("need_system", true);
        oz50 oz50Var = new oz50(PhotosFragment.class, null, bundle);
        oz50Var.s(true);
        oz50Var.h(activity, 51);
    }

    @Override // xsna.sw50.d
    public final com.vk.attachpicker.screen.h c(PhotoEditorActivity photoEditorActivity, File file, boolean z) {
        photoEditorActivity.setRequestedOrientation(1);
        return new com.vk.attachpicker.screen.h(new zlw(file), null, new zjg(photoEditorActivity), null, z, null, null, null);
    }

    @Override // xsna.sw50.d
    public final void e(FragmentActivity fragmentActivity, int i, boolean z, izs izsVar) {
        Intent putExtra = new Intent(fragmentActivity, (Class<?>) AvatarChangeActivity.class).putExtra("skip_avatar_publish", z);
        izsVar.invoke(putExtra);
        Activity h = e3m.h(fragmentActivity);
        if (h != null) {
            h.startActivityForResult(putExtra, i);
        }
    }

    @Override // xsna.sw50.d
    public final void f(Context context, p9e p9eVar, i9e i9eVar) {
        MediaPickerFragmentImpl mediaPickerFragmentImpl = new MediaPickerFragmentImpl();
        Bundle bundle = new Bundle();
        i9eVar.invoke(bundle);
        mediaPickerFragmentImpl.setArguments(bundle);
        mediaPickerFragmentImpl.T0 = p9eVar;
        Activity h = e3m.h(context);
        FragmentActivity fragmentActivity = h instanceof FragmentActivity ? (FragmentActivity) h : null;
        if (fragmentActivity == null) {
            return;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.g(R.id.media_picker_fragment_host, mediaPickerFragmentImpl, null);
        aVar.d(null);
        aVar.r = true;
        aVar.k(false);
    }

    @Override // xsna.sw50.d
    public final oz50 g(String str) {
        int i = AvatarChangeCropFragment.a0;
        Bundle bundle = new Bundle();
        bundle.putString(X3.i.b, str);
        bundle.putInt("subtitle_res", R.string.highligh_custom_cover_preview_description);
        bundle.putBoolean("show_preview", false);
        oz50 oz50Var = new oz50(AvatarChangeCropFragment.class, null, bundle);
        oz50Var.s(true);
        return oz50Var;
    }

    @Override // xsna.sw50.d
    public final Intent h(Context context, boolean z, int i, int i2, int i3) {
        return new Intent(context, (Class<?>) PhotoVideoAttachActivity.class).putExtra("camera_enabled", z).putExtra("selection_limit", i).putExtra("total_selection_limit", i2).putExtra("prevent_styling", true).putExtra("media_type", i3).putExtra("initialize_camera", false);
    }
}
