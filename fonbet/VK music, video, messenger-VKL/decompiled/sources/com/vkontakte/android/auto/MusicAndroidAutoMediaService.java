package com.vkontakte.android.auto;

import android.content.Intent;
import com.vk.catalog2.common.ui.mvp.auto.VKAndroidAutoCatalogMediaService;
import com.vk.navigation.NavigationDelegateActivity;
import xsna.r6m;

/* compiled from: MusicAndroidAutoMediaService.kt */
/* loaded from: classes7.dex */
public final class MusicAndroidAutoMediaService extends VKAndroidAutoCatalogMediaService {
    public static final /* synthetic */ int p = 0;

    /* compiled from: MusicAndroidAutoMediaService.kt */
    public static final class a {
        public static void a(NavigationDelegateActivity navigationDelegateActivity) {
            r6m.a.getClass();
            if (r6m.b && VKAndroidAutoCatalogMediaService.o) {
                Intent intent = new Intent(navigationDelegateActivity, (Class<?>) MusicAndroidAutoMediaService.class);
                intent.setAction("com.vk.catalog2.action_content_changed");
                navigationDelegateActivity.startService(intent);
            }
        }
    }
}
