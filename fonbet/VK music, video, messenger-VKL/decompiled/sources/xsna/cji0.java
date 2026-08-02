package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.uii0;

/* compiled from: SendStoryUsersSearchEmptyDelegate.kt */
/* loaded from: classes16.dex */
public final class cji0 extends p1u0<uii0.c> {

    /* compiled from: SendStoryUsersSearchEmptyDelegate.kt */
    public static final class a extends vfz<uii0.c> {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(uii0.c cVar) {
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends uii0.c> b(ViewGroup viewGroup) {
        return new a(R.layout.layout_story_send_search_empty, viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof uii0.c;
    }
}
