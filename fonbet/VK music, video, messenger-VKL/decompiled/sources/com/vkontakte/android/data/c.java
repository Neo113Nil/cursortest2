package com.vkontakte.android.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vkontakte.android.data.PostInteract;
import xsna.raz;

/* compiled from: PostInteract.java */
/* loaded from: classes7.dex */
public final class c implements raz {
    public final /* synthetic */ PostInteract a;

    public c(PostInteract postInteract) {
        this.a = postInteract;
    }

    @Override // xsna.raz
    public final void a(String str) {
        this.a.Db(PostInteract.Type.vk_link_click, str);
    }

    @Override // xsna.raz
    public final void b(@Nullable String str) {
        this.a.Db(PostInteract.Type.link_click, str);
    }

    @Override // xsna.raz
    @NonNull
    public final String n() {
        return this.a.b;
    }
}
