package com.vkontakte.android.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vkontakte.android.R;
import java.util.List;
import xsna.dd80;
import xsna.epx;
import xsna.ptx0;
import xsna.ucp;

/* compiled from: DonutLinkAttachment.kt */
/* loaded from: classes7.dex */
public final class DonutLinkAttachment extends Attachment implements ptx0 {
    public static final Serializer.c<DonutLinkAttachment> CREATOR = new a();
    public final Owner f;
    public final UserId g;
    public final String h;
    public final int i;
    public final int j;
    public final List<Owner> k;
    public final LinkButton l;
    public final Action m;
    public final CharSequence n;
    public final CharSequence o;
    public final int p;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DonutLinkAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DonutLinkAttachment a(Serializer serializer) {
            return new DonutLinkAttachment((Owner) serializer.G(Owner.class.getClassLoader()), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.u(), serializer.u(), serializer.k(Owner.class), (LinkButton) serializer.G(LinkButton.class.getClassLoader()), (Action) serializer.G(Action.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DonutLinkAttachment[i];
        }
    }

    public DonutLinkAttachment(Owner owner, UserId userId, String str, int i, int i2, List<Owner> list, LinkButton linkButton, Action action) {
        CharSequence charSequence;
        String str2;
        this.f = owner;
        this.g = userId;
        this.h = str;
        this.i = i;
        this.j = i2;
        this.k = list;
        this.l = linkButton;
        this.m = action;
        CharSequence charSequence2 = null;
        if (owner == null || (str2 = owner.c) == null) {
            charSequence = null;
        } else {
            ucp ucpVar = ucp.a;
            charSequence = ucp.i(str2);
        }
        this.n = charSequence;
        if (str != null) {
            ucp ucpVar2 = ucp.a;
            charSequence2 = ucp.i(str);
        }
        this.o = charSequence2;
        this.p = 5;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return this.p;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.r;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.f);
        serializer.e0(this.g);
        serializer.j0(this.h);
        serializer.S(this.i);
        serializer.S(this.j);
        serializer.W(this.k);
        serializer.i0(this.l);
        serializer.i0(this.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return DonutLinkAttachment.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.g, ((DonutLinkAttachment) obj).g);
    }

    public final int hashCode() {
        return Long.hashCode(this.g.b);
    }

    @Override // xsna.ptx0
    public final UserId q() {
        throw null;
    }

    @Override // xsna.ptx0
    public final Owner s() {
        throw null;
    }

    public final String toString() {
        return "donut_link" + this.g;
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_link;
    }
}
