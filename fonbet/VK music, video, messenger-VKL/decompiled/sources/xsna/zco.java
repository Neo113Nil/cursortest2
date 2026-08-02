package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.Surface;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import com.vk.video.ui.discovery.minimizable.related_videos.m;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zco implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zco(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                cdo cdoVar = (cdo) this.c;
                Context context = (Context) this.d;
                ((Integer) obj3).getClass();
                int i = ((e520) obj2).a;
                if (i == R.id.draft_go_to_clips_editor) {
                    cdoVar.e.invoke();
                } else if (i == R.id.draft_delete) {
                    final x3i x3iVar = new x3i(cdoVar, 8);
                    h7u0.a aVar = new h7u0.a(context);
                    aVar.U(R.string.delete_draft_confirm);
                    aVar.c0(R.string.delete, new DialogInterface.OnClickListener() { // from class: xsna.ado
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            x3i.this.invoke();
                        }
                    });
                    aVar.W(R.string.cancel, null);
                    aVar.m();
                }
                cdoVar.dismiss();
                return s3q0.a;
            case 1:
                izs izsVar = (izs) this.c;
                Surface surface = (Surface) this.d;
                ((Integer) obj2).intValue();
                ((Integer) obj3).intValue();
                izsVar.invoke(surface);
                return s3q0.a;
            default:
                VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist = (VideoDiscoveryRelatedVideosSourceArgs.Playlist) this.c;
                com.vk.video.ui.discovery.minimizable.related_videos.e eVar = (com.vk.video.ui.discovery.minimizable.related_videos.e) this.d;
                return new c.s0.e(com.vk.video.ui.discovery.minimizable.related_videos.n.a(m.c.a, playlist.g.intValue(), (rbt0) obj, eVar.c, null, null));
        }
    }
}
