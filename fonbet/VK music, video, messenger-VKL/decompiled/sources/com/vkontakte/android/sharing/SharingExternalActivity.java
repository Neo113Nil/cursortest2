package com.vkontakte.android.sharing;

import android.content.Intent;
import android.os.Bundle;
import com.vk.auth.main.AuthActivity;
import com.vk.dto.common.Attachment;
import com.vk.photos.legacy.PhotoAlbumListFragment;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.stat.AppStartReporter;
import java.util.List;
import xsna.l93;
import xsna.q860;
import xsna.rfc0;
import xsna.rl3;
import xsna.zwc0;

/* compiled from: SharingExternalActivity.kt */
/* loaded from: classes7.dex */
public class SharingExternalActivity extends BaseSharingExternalActivity {
    @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity
    public final void G3(String str, List<? extends Attachment> list) {
        Attachment[] attachmentArr;
        int i = rfc0.a;
        q860 q860Var = new q860();
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (list == null || (attachmentArr = (Attachment[]) list.toArray(new Attachment[0])) == null) {
            attachmentArr = new Attachment[0];
        }
        q860Var.j = zwc0.a(q860Var.j, null, str2, q860Var.e.a(rl3.u0(attachmentArr)), null, null, false, 57);
        q860Var.p(-1, this);
    }

    @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity
    public final void H3() {
        PhotoAlbumListFragment.f fVar = new PhotoAlbumListFragment.f();
        Bundle bundle = fVar.j;
        bundle.putBoolean("select", true);
        bundle.putBoolean("select_album", true);
        fVar.h(this, 103);
    }

    @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity
    public void K3() {
        AppStartReporter.c(AppStartReporter.StartMethod.SHARING, false, this, new l93(), false);
    }

    @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity
    public final Intent R2() {
        return new Intent(this, (Class<?>) AuthActivity.class);
    }
}
