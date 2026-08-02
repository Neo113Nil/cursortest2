package xsna;

import android.content.Context;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.upload.impl.c;
import com.vkontakte.android.R;

/* compiled from: MusicPlaylistCoverPhotoUploadTask.kt */
/* loaded from: classes6.dex */
public final class rz40 extends oda0<Photo> {
    public final UserId m;
    public final int n;
    public String o;

    public rz40(int i, UserId userId, String str) {
        super(str, null, 6);
        this.m = userId;
        this.n = i;
        this.o = "";
    }

    @Override // xsna.sp6
    public final void L(Parcelable parcelable) {
        Photo photo = (Photo) parcelable;
        ozg0.a().p(photo != null ? Integer.valueOf(photo.c) : null, this.i);
        c.b.a(photo);
    }

    @Override // xsna.sp6
    public final boolean Q() {
        return false;
    }

    @Override // xsna.sp6
    public final Parcelable Y() {
        if (drm0.N(this.o)) {
            return null;
        }
        String str = this.o;
        tfx tfxVar = new tfx("photos.saveAudioPlaylistCover", new lr(27), new pn(29));
        tfx.n(tfxVar, "owner_id", this.m, 0L, 0L, 12);
        tfx.o(tfxVar, "response_json", str, 0, 0, 12);
        return (Photo) rsg0.a0(yfb.x(tfxVar)).L(new or20(new qz40(this, 0), 5), false).a();
    }

    @Override // com.vk.upload.impl.b
    public final String a0() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(R.string.uploading_photo);
    }

    @Override // com.vk.upload.impl.b
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        tfx tfxVar = new tfx("photos.getAudioPlaylistCoverUploadServer", new jr(25), new bz60(3));
        tfx.n(tfxVar, "owner_id", this.m, 0L, 0L, 12);
        dz2 x = yfb.x(tfxVar);
        this.g = x.b;
        return rsg0.a0(x).U(new s7(new qey(12), 23));
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) {
        this.o = str;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "AudioPlaylistCoverPhotoUploadTask";
    }
}
