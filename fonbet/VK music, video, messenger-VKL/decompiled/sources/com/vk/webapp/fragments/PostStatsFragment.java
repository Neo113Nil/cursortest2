package com.vk.webapp.fragments;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import xsna.er;
import xsna.oz50;

/* compiled from: PostStatsFragment.kt */
/* loaded from: classes7.dex */
public final class PostStatsFragment extends VKSuperAppBrowserFragment {
    public static final /* synthetic */ int a0 = 0;

    /* compiled from: PostStatsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: PostStatsFragment.kt */
    public static final class b {
        public static a a(int i, UserId userId) {
            a aVar = new a(PostStatsFragment.class, null, null);
            Uri.Builder a = er.a(HttpRequest.DEFAULT_SCHEME);
            int i2 = VKSuperAppBrowserFragment.Y;
            Uri.Builder appendEncodedPath = a.authority(VKSuperAppBrowserFragment.a.a()).appendPath("post_stats").appendEncodedPath("");
            StringBuilder sb = new StringBuilder();
            sb.append(userId);
            sb.append('_');
            sb.append(i);
            aVar.j.putString("key_url", appendEncodedPath.appendQueryParameter("post", sb.toString()).build().toString());
            return aVar;
        }
    }
}
