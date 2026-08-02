package xsna;

import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.SourcePhoto;
import java.util.ArrayList;

/* compiled from: PostHeaderPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class y3c0 extends de {
    public final int b = cn70.b(32);

    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        SourcePhoto sourcePhoto;
        SourcePhoto sourcePhoto2;
        Owner d;
        Image image;
        SourcePhoto sourcePhoto3;
        Image image2;
        Parcelable parcelable = u1c0Var.a;
        String str = null;
        wsx0 wsx0Var = parcelable instanceof wsx0 ? (wsx0) parcelable : null;
        if (wsx0Var == null) {
            return 1;
        }
        EntryHeader header = wsx0Var.getHeader();
        ArrayList arrayList = (header == null || (sourcePhoto3 = header.b) == null || (image2 = sourcePhoto3.c) == null) ? null : image2.b;
        if (arrayList != null && !arrayList.isEmpty()) {
            return 1;
        }
        EntryHeader header2 = wsx0Var.getHeader();
        ArrayList arrayList2 = (header2 == null || (sourcePhoto2 = header2.b) == null || (d = sourcePhoto2.d()) == null || (image = d.g) == null) ? null : image.b;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            return 1;
        }
        EntryHeader header3 = wsx0Var.getHeader();
        if (header3 != null && (sourcePhoto = header3.b) != null) {
            str = sourcePhoto.d;
        }
        return (str == null || str.length() == 0) ? 0 : 1;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        EntryHeader header;
        SourcePhoto sourcePhoto;
        SourcePhoto sourcePhoto2;
        SourcePhoto sourcePhoto3;
        Owner d;
        Image image;
        SourcePhoto sourcePhoto4;
        Owner d2;
        Image image2;
        SourcePhoto sourcePhoto5;
        Image image3;
        SourcePhoto sourcePhoto6;
        Image image4;
        Parcelable parcelable = u1c0Var.a;
        wsx0 wsx0Var = parcelable instanceof wsx0 ? (wsx0) parcelable : null;
        if (wsx0Var != null && i == 0) {
            EntryHeader header2 = wsx0Var.getHeader();
            ArrayList arrayList = (header2 == null || (sourcePhoto6 = header2.b) == null || (image4 = sourcePhoto6.c) == null) ? null : image4.b;
            int i2 = this.b;
            if (arrayList == null || arrayList.isEmpty()) {
                EntryHeader header3 = wsx0Var.getHeader();
                ArrayList arrayList2 = (header3 == null || (sourcePhoto4 = header3.b) == null || (d2 = sourcePhoto4.d()) == null || (image2 = d2.g) == null) ? null : image2.b;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    EntryHeader header4 = wsx0Var.getHeader();
                    String str = (header4 == null || (sourcePhoto2 = header4.b) == null) ? null : sourcePhoto2.d;
                    if (str != null && str.length() != 0 && (header = wsx0Var.getHeader()) != null && (sourcePhoto = header.b) != null) {
                        return sourcePhoto.d;
                    }
                } else {
                    EntryHeader header5 = wsx0Var.getHeader();
                    if (header5 != null && (sourcePhoto3 = header5.b) != null && (d = sourcePhoto3.d()) != null && (image = d.g) != null) {
                        Serializer.c<Owner> cVar = Owner.CREATOR;
                        return Owner.a.a(i2, image);
                    }
                }
            } else {
                EntryHeader header6 = wsx0Var.getHeader();
                if (header6 != null && (sourcePhoto5 = header6.b) != null && (image3 = sourcePhoto5.c) != null) {
                    Serializer.c<Owner> cVar2 = Owner.CREATOR;
                    return Owner.a.a(i2, image3);
                }
            }
        }
        return null;
    }
}
