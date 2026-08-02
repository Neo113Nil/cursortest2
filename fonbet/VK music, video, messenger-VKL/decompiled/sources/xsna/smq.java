package xsna;

import android.content.Context;
import com.vk.catalog2.common.ui.holders.ArticleVh;
import com.vk.catalog2.feature.music.holders.PodcastSliderItemRoundBackgroundVh;
import com.vk.dto.articles.Article;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: FaveBridge.kt */
/* loaded from: classes15.dex */
public interface smq {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void f(smq smqVar, Context context, gmq gmqVar, wzs wzsVar, wzs wzsVar2, izs izsVar, boolean z, String str, String str2, int i) {
        if ((i & 4) != 0) {
            wzsVar = null;
        }
        if ((i & 8) != 0) {
            wzsVar2 = null;
        }
        if ((i & 16) != 0) {
            izsVar = null;
        }
        if ((i & 32) != 0) {
            z = true;
        }
        if ((i & 64) != 0) {
            str = null;
        }
        smqVar.h(context, gmqVar, wzsVar, wzsVar2, izsVar, z, str, (i & 128) != 0 ? null : "qr_popup", (i & 256) != 0 ? null : str2);
    }

    void a(Context context, String str);

    boolean k();

    void m(Context context);

    default void e(Context context) {
    }

    default void i(Context context) {
    }

    default void j(Context context) {
    }

    default void n(Context context) {
    }

    default void h(Context context, gmq gmqVar, wzs<? super Boolean, ? super gmq, s3q0> wzsVar, wzs<? super Boolean, ? super gmq, s3q0> wzsVar2, izs<? super gmq, s3q0> izsVar, boolean z, String str, String str2, String str3) {
    }

    default void b(Context context, UserProfile userProfile, wzs wzsVar, izs izsVar, String str, String str2, String str3) {
    }

    default void c(Context context, Group group, wzs wzsVar, izs izsVar, String str, String str2, String str3) {
    }

    default void d(Context context, Article article, lo7 lo7Var, ArticleVh.a aVar, izs izsVar, boolean z, String str, String str2) {
    }

    default void g(Context context, ExtendedUserProfile extendedUserProfile, w1 w1Var, String str) {
    }

    default void o(Context context, String str, wzs wzsVar, izs izsVar) {
    }

    default void l(Context context, MusicTrack musicTrack, PodcastSliderItemRoundBackgroundVh.a aVar, PodcastSliderItemRoundBackgroundVh.b bVar, String str) {
    }
}
