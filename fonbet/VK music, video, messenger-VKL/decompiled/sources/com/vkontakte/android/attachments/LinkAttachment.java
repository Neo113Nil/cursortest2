package com.vkontakte.android.attachments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.common.links.AwayLink;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import xsna.dd80;

/* loaded from: classes7.dex */
public class LinkAttachment extends Attachment {
    public static final Serializer.c<LinkAttachment> CREATOR = new a();
    public final AwayLink f;
    public final String g;
    public final String h;
    public final String i;

    @Nullable
    public transient PostInteract j;
    public String k;
    public DeprecatedStatisticInterface l;

    @Nullable
    public final ButtonAction m;

    @Nullable
    public final SnippetAttachment n;

    public class a extends Serializer.c<LinkAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LinkAttachment a(@NonNull Serializer serializer) {
            return new LinkAttachment((AwayLink) serializer.G(AwayLink.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), (ButtonAction) serializer.G(ButtonAction.class.getClassLoader()), (SnippetAttachment) serializer.G(SnippetAttachment.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkAttachment[i];
        }
    }

    public LinkAttachment(AwayLink awayLink, String str, String str2, String str3, @Nullable ButtonAction buttonAction, @Nullable SnippetAttachment snippetAttachment) {
        this.f = awayLink;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.m = buttonAction;
        this.n = snippetAttachment;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return 5;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.r;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.i0(this.m);
        serializer.i0(this.n);
    }

    public final String toString() {
        String str = this.f.b;
        return (str.startsWith("http:") || str.startsWith("https:")) ? str : "http://".concat(str);
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_link;
    }

    public LinkAttachment(String str, String str2, String str3, String str4, Bundle bundle, @Nullable ButtonAction buttonAction, @Nullable SnippetAttachment snippetAttachment) {
        this(new AwayLink(str, bundle), str2, str3, str4, buttonAction, snippetAttachment);
    }

    public LinkAttachment(String str, String str2, String str3) {
        this(str, str2, str3, "", null, null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LinkAttachment(SnippetAttachment snippetAttachment) {
        this(r0.b, snippetAttachment.g, snippetAttachment.o, snippetAttachment.j, r0.c, snippetAttachment.v, snippetAttachment);
        AwayLink awayLink = snippetAttachment.f;
    }

    public LinkAttachment(String str) {
        this(str, str, str);
    }
}
