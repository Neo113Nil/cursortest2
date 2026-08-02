package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.music.Artist;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jq3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Artist c;

    public /* synthetic */ jq3(Artist artist, int i) {
        this.b = i;
        this.c = artist;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                w9y w9yVar = (w9y) obj;
                Artist artist = this.c;
                w9yVar.e(artist.b, "id");
                w9yVar.e(artist.d, "bio");
                w9yVar.e(artist.e, "genres");
                w9yVar.b(Boolean.valueOf(artist.g), "is_album_cover");
                Image image = artist.f;
                w9yVar.e(image != null ? image.Gb() : null, "photo");
                w9yVar.e(artist.c, "name");
                w9yVar.b(Boolean.valueOf(artist.h), "can_follow");
                w9yVar.b(Boolean.valueOf(artist.i), "is_followed");
                w9yVar.e(artist.j, "track_code");
                w9yVar.b(Boolean.valueOf(artist.k), "can_play");
                w9yVar.d(artist.l, "video_owner_id");
                w9yVar.c(Integer.valueOf(artist.m), "flags_context");
                w9yVar.c(artist.n, "listeners_count");
                break;
            default:
                bn40.g("AudioUnfollowArtist", (Integer) obj);
                Artist artist2 = this.c;
                artist2.i = false;
                r5v0 r5v0Var = k840.a.h;
                if (r5v0Var == null) {
                    r5v0Var = null;
                }
                r5v0Var.b(new uq3(artist2, false));
                break;
        }
        return s3q0.a;
    }
}
