package xsna;

import android.content.Context;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.privacyui.album.PrivacyEditAlbumCommentsFragment;
import com.vk.privacyui.album.PrivacyEditAlbumWatchFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.webapp.fragments.PrivacyFragment;
import com.vkontakte.android.fragments.friends.lists.PrivacyEditFriendsListFragment;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.collections.builders.ListBuilder;
import xsna.sw50;

/* compiled from: CommonPrivacySettingsImpl.kt */
/* loaded from: classes7.dex */
public final class slg implements sw50.n {
    public final Object a;

    public slg(Lazy<? extends d2o> lazy) {
        this.a = lazy;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50.n
    public final void a(Context context, DonutLevel donutLevel, ArrayList arrayList, r9c0 r9c0Var) {
        d2o d2oVar = (d2o) this.a.getValue();
        if (d2oVar != null) {
            d2oVar.a(context, donutLevel, arrayList, r9c0Var);
        }
    }

    @Override // xsna.sw50.n
    public final void b(FragmentImpl fragmentImpl, UserId[] userIdArr, int i, int i2) {
        PrivacyEditFriendsListFragment.a aVar = new PrivacyEditFriendsListFragment.a(PrivacyEditFriendsListFragment.class, null, null);
        aVar.j.putParcelableArrayList("selectedUsers", new ArrayList<>(rl3.u0(userIdArr)));
        aVar.B(fragmentImpl.getString(i));
        aVar.z();
        aVar.y();
        aVar.s(true);
        aVar.g(i2, fragmentImpl);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sw50.n
    public final void c(Context context, DonutLevel donutLevel, ListBuilder listBuilder) {
        d2o d2oVar = (d2o) this.a.getValue();
        if (d2oVar != null) {
            d2oVar.b(context, donutLevel, listBuilder);
        }
    }

    @Override // xsna.sw50.n
    public final void d(Context context, PrivacySetting privacySetting) {
        PrivacyEditAlbumCommentsFragment.a aVar = new PrivacyEditAlbumCommentsFragment.a(PrivacyEditAlbumCommentsFragment.class, null, null);
        aVar.y(MobileOfficialAppsCoreNavStat$EventScreen.SETTINGS_PRIVACY_PHOTO_COMMENTS);
        aVar.z(privacySetting);
        aVar.h(e3m.h(context), 8296);
    }

    @Override // xsna.sw50.n
    public final void e(Context context, PrivacySetting privacySetting) {
        PrivacyEditAlbumWatchFragment.a aVar = new PrivacyEditAlbumWatchFragment.a(PrivacyEditAlbumWatchFragment.class, null, null);
        aVar.y(MobileOfficialAppsCoreNavStat$EventScreen.SETTINGS_PRIVACY_PHOTO);
        aVar.z(privacySetting);
        aVar.h(e3m.h(context), 8295);
    }

    @Override // xsna.sw50.n
    public final void g(Context context, String str, boolean z) {
        int i = PrivacyFragment.a0;
        PrivacyFragment.a a = PrivacyFragment.b.a(z, false, str, null, 52);
        a.s(true);
        a.k(context);
    }
}
