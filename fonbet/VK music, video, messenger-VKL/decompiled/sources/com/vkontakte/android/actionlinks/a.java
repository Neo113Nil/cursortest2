package com.vkontakte.android.actionlinks;

import com.vk.dto.actionlinks.ActionLink;
import com.vkontakte.android.actionlinks.BaseItem;

/* compiled from: ActionLinkItem.kt */
/* loaded from: classes7.dex */
public final class a extends BaseItem {
    public final ActionLink e;
    public boolean f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ActionLink actionLink, int i) {
        super(BaseItem.Type.ACTION_LINK);
        boolean z = (i & 2) != 0;
        this.e = actionLink;
        this.f = z;
        this.g = false;
    }
}
