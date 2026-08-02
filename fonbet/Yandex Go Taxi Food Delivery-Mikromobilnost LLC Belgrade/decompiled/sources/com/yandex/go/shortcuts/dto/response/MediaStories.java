package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.dto.response.Action$MediaStory;
import com.yandex.go.dto.response.Action$MediaStory$$serializer;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/MediaStories;", "Lcom/yandex/go/shortcuts/dto/response/f0;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/w", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MediaStories extends f0 {
    public static final w Companion = new w();
    public final Action$MediaStory a;
    public final CountersShowPolicy b;

    public /* synthetic */ MediaStories(int i, Action$MediaStory action$MediaStory, CountersShowPolicy countersShowPolicy) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = action$MediaStory;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = countersShowPolicy;
        }
    }

    public static final /* synthetic */ void d(MediaStories mediaStories, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || mediaStories.a != null) {
            yjdVar.g(serialDescriptor, 0, Action$MediaStory$$serializer.INSTANCE, mediaStories.a);
        }
        if (!yjdVar.F() && mediaStories.b == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 1, CountersShowPolicy$$serializer.INSTANCE, mediaStories.b);
    }

    @Override // com.yandex.go.shortcuts.dto.response.f0
    public final Type a() {
        return Type.MEDIA_STORIES;
    }

    /* renamed from: b, reason: from getter */
    public final Action$MediaStory getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final CountersShowPolicy getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStories)) {
            return false;
        }
        MediaStories mediaStories = (MediaStories) obj;
        return jl40.l(this.a, mediaStories.a) && jl40.l(this.b, mediaStories.b);
    }

    public final int hashCode() {
        Action$MediaStory action$MediaStory = this.a;
        int hashCode = (action$MediaStory == null ? 0 : action$MediaStory.hashCode()) * 31;
        CountersShowPolicy countersShowPolicy = this.b;
        return hashCode + (countersShowPolicy != null ? countersShowPolicy.hashCode() : 0);
    }

    public final String toString() {
        return "MediaStories(action=" + this.a + ", showPolicy=" + this.b + Extension.C_BRAKE;
    }

    public MediaStories() {
        this.a = null;
        this.b = null;
    }
}
