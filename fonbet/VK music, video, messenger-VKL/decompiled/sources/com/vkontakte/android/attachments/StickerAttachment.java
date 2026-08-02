package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.stickers.StickerItem;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.bpn0;
import xsna.cf00;
import xsna.d4r;
import xsna.dhr0;
import xsna.f84;
import xsna.fpf0;
import xsna.iah0;
import xsna.kcl0;
import xsna.qcy;
import xsna.tdm;
import xsna.tfw;
import xsna.zcl;

/* compiled from: StickerAttachment.kt */
/* loaded from: classes7.dex */
public final class StickerAttachment extends Attachment implements tfw {
    public static final Serializer.c<StickerAttachment> CREATOR;
    public static final a k;
    public static final /* synthetic */ qcy<Object>[] l;
    public static int m;
    public static final int n;
    public final StickerItem f;
    public final int g;
    public final String h;
    public final bpn0 i;
    public final tdm j;

    /* compiled from: StickerAttachment.kt */
    public static final class a {
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StickerAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerAttachment a(Serializer serializer) {
            return new StickerAttachment((StickerItem) serializer.G(StickerItem.class.getClassLoader()), serializer.u(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerAttachment[i];
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(StickerAttachment.class, "shouldAnimationPlay", "getShouldAnimationPlay()Z", 0);
        fpf0.a.getClass();
        l = new qcy[]{mutablePropertyReference1Impl};
        k = new a();
        m = -1;
        n = iah0.a(176);
        CREATOR = new b();
    }

    public StickerAttachment(StickerItem stickerItem, int i) {
        this(stickerItem, i, null, 4, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.f);
        serializer.S(this.g);
        serializer.j0(this.h);
    }

    public final boolean V0() {
        if (((kcl0) this.i.getValue()).K0() && this.f.g.V0()) {
            if (((Boolean) this.j.getValue(this, l[0])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.tfw
    public final String h9() {
        return ((kcl0) this.i.getValue()).z0(this.f, n, dhr0.M());
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_sticker;
    }

    public /* synthetic */ StickerAttachment(StickerItem stickerItem, int i, String str, int i2, zcl zclVar) {
        this(stickerItem, i, (i2 & 4) != 0 ? null : str);
    }

    public StickerAttachment(StickerItem stickerItem, int i, String str) {
        this.f = stickerItem;
        this.g = i;
        this.h = str;
        this.i = new bpn0(new f84(19));
        this.j = new tdm(new cf00(this, 26), new d4r(7));
    }
}
