package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.vk.common.links.LaunchContext;
import com.vk.dto.hints.Hint;
import com.vk.dto.user.UserProfile;
import com.vk.privacyui.PrivacyEditFragment;
import com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity;
import com.vk.stickers.api.models.AlbumStickerStyle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p37 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p37(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var) {
        this.b = 2;
        this.d = context;
        this.e = uri;
        this.c = yp80Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                break;
            case 1:
                CoverCropActivity coverCropActivity = (CoverCropActivity) obj4;
                int i2 = CoverCropActivity.w;
                ((wh50) obj2).setValue(Boolean.FALSE);
                Intent intent = new Intent();
                intent.putExtra("__cover_rect_key__", zjq.o((zhf0) obj));
                intent.putExtra("__cover_url_key__", (String) obj3);
                s3q0 s3q0Var = s3q0.a;
                coverCropActivity.setResult(-1, intent);
                coverCropActivity.finish();
                break;
            case 2:
                xwk.d().getBrowser().d((Context) obj4, (Uri) obj3, true);
                ((yp80) obj2).onSuccess();
                break;
            case 3:
                PrivacyEditFragment privacyEditFragment = (PrivacyEditFragment) obj4;
                int[] iArr = PrivacyEditFragment.W0;
                privacyEditFragment.getClass();
                ((ArrayList) obj3).remove((UserProfile) obj);
                ((gzs) obj2).invoke();
                privacyEditFragment.q();
                privacyEditFragment.Q0 = true;
                break;
            case 4:
                ((y7m0) obj4).i((h5a0) obj3, (AlbumStickerStyle) ((List) obj2).get(((Integer) obj).intValue()), true);
                break;
            default:
                zim0 zim0Var = (zim0) obj4;
                zim0Var.m = (etv0) obj;
                zim0Var.f.q();
                ((wvw) obj3).b().b(((Hint) obj2).b);
                zim0Var.i.postDelayed(new o4(zim0Var, 20), 3000L);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ p37(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }
}
