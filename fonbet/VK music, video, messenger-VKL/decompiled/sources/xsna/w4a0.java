package xsna;

import com.vk.dto.common.ImageSize;
import com.vkontakte.android.attachments.AlbumAttachment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PhotoAlbumGridItemUiDto.kt */
/* loaded from: classes4.dex */
public final class w4a0 extends v64<AlbumAttachment> {
    public final AlbumAttachment e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final List<ImageSize> i;
    public final boolean j;
    public final int k;
    public final int l;

    public w4a0(AlbumAttachment albumAttachment, boolean z, boolean z2, String str, ArrayList arrayList, boolean z3, int i, int i2) {
        super(2, albumAttachment, i, i2);
        this.e = albumAttachment;
        this.f = z;
        this.g = z2;
        this.h = str;
        this.i = arrayList;
        this.j = z3;
        this.k = i;
        this.l = i2;
    }

    @Override // xsna.v64
    public final AlbumAttachment a() {
        return this.e;
    }

    @Override // xsna.v64
    public final int b() {
        return this.l;
    }

    @Override // xsna.v64
    public final int d() {
        return this.k;
    }
}
