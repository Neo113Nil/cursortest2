package xsna;

import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.OverlayImage;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.SourcePhoto;
import java.util.ArrayList;

/* compiled from: HeaderPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class ayu extends de {
    public static final int b = cn70.b(36);

    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        int i;
        SourcePhoto sourcePhoto;
        SourcePhoto sourcePhoto2;
        Owner d;
        Image image;
        ArrayList arrayList;
        EntryHeader header;
        OverlayImage overlayImage;
        OverlayImage overlayImage2;
        Image image2;
        SourcePhoto sourcePhoto3;
        Image image3;
        Parcelable parcelable = u1c0Var.a;
        String str = null;
        wsx0 wsx0Var = parcelable instanceof wsx0 ? (wsx0) parcelable : null;
        if (wsx0Var == null) {
            return 1;
        }
        EntryHeader header2 = wsx0Var.getHeader();
        ArrayList arrayList2 = (header2 == null || (sourcePhoto3 = header2.b) == null || (image3 = sourcePhoto3.c) == null) ? null : image3.b;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            EntryHeader header3 = wsx0Var.getHeader();
            ArrayList arrayList3 = (header3 == null || (sourcePhoto2 = header3.b) == null || (d = sourcePhoto2.d()) == null || (image = d.g) == null) ? null : image.b;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                EntryHeader header4 = wsx0Var.getHeader();
                String str2 = (header4 == null || (sourcePhoto = header4.b) == null) ? null : sourcePhoto.d;
                if (str2 == null || str2.length() == 0) {
                    i = 0;
                    EntryHeader header5 = wsx0Var.getHeader();
                    arrayList = (header5 != null || (overlayImage2 = header5.f) == null || (image2 = overlayImage2.b) == null) ? null : image2.b;
                    if (arrayList != null || arrayList.isEmpty()) {
                        header = wsx0Var.getHeader();
                        if (header != null && (overlayImage = header.f) != null) {
                            str = overlayImage.c;
                        }
                        if (str != null || str.length() == 0) {
                        }
                    }
                    return i + 1;
                }
            }
        }
        i = 1;
        EntryHeader header52 = wsx0Var.getHeader();
        if (header52 != null) {
        }
        if (arrayList != null) {
        }
        header = wsx0Var.getHeader();
        if (header != null) {
            str = overlayImage.c;
        }
        return str != null ? i : i;
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
        EntryHeader header2;
        OverlayImage overlayImage;
        OverlayImage overlayImage2;
        OverlayImage overlayImage3;
        Image image5;
        OverlayImage overlayImage4;
        Image image6;
        Parcelable parcelable = u1c0Var.a;
        wsx0 wsx0Var = parcelable instanceof wsx0 ? (wsx0) parcelable : null;
        if (wsx0Var != null) {
            int i2 = b;
            if (i == 0) {
                EntryHeader header3 = wsx0Var.getHeader();
                ArrayList arrayList = (header3 == null || (sourcePhoto6 = header3.b) == null || (image4 = sourcePhoto6.c) == null) ? null : image4.b;
                if (arrayList == null || arrayList.isEmpty()) {
                    EntryHeader header4 = wsx0Var.getHeader();
                    ArrayList arrayList2 = (header4 == null || (sourcePhoto4 = header4.b) == null || (d2 = sourcePhoto4.d()) == null || (image2 = d2.g) == null) ? null : image2.b;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        EntryHeader header5 = wsx0Var.getHeader();
                        String str = (header5 == null || (sourcePhoto2 = header5.b) == null) ? null : sourcePhoto2.d;
                        if (str != null && str.length() != 0 && (header = wsx0Var.getHeader()) != null && (sourcePhoto = header.b) != null) {
                            return sourcePhoto.d;
                        }
                    } else {
                        EntryHeader header6 = wsx0Var.getHeader();
                        if (header6 != null && (sourcePhoto3 = header6.b) != null && (d = sourcePhoto3.d()) != null && (image = d.g) != null) {
                            Serializer.c<Owner> cVar = Owner.CREATOR;
                            return Owner.a.a(i2, image);
                        }
                    }
                } else {
                    EntryHeader header7 = wsx0Var.getHeader();
                    if (header7 != null && (sourcePhoto5 = header7.b) != null && (image3 = sourcePhoto5.c) != null) {
                        Serializer.c<Owner> cVar2 = Owner.CREATOR;
                        return Owner.a.a(i2, image3);
                    }
                }
            } else if (i == 1) {
                EntryHeader header8 = wsx0Var.getHeader();
                ArrayList arrayList3 = (header8 == null || (overlayImage4 = header8.f) == null || (image6 = overlayImage4.b) == null) ? null : image6.b;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    EntryHeader header9 = wsx0Var.getHeader();
                    String str2 = (header9 == null || (overlayImage2 = header9.f) == null) ? null : overlayImage2.c;
                    if (str2 != null && str2.length() != 0 && (header2 = wsx0Var.getHeader()) != null && (overlayImage = header2.f) != null) {
                        return overlayImage.c;
                    }
                } else {
                    EntryHeader header10 = wsx0Var.getHeader();
                    if (header10 != null && (overlayImage3 = header10.f) != null && (image5 = overlayImage3.b) != null) {
                        Serializer.c<Owner> cVar3 = Owner.CREATOR;
                        return Owner.a.a(i2, image5);
                    }
                }
            }
        }
        return null;
    }
}
