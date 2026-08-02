package com.yandex.mobile.drive.sdk.full.model;

import defpackage.jl40;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/model/User;", "", "Lcom/yandex/mobile/drive/sdk/full/model/Details;", "details", "Lcom/yandex/mobile/drive/sdk/full/model/BlockChat;", "show_chat", "<init>", "(Lcom/yandex/mobile/drive/sdk/full/model/Details;Lcom/yandex/mobile/drive/sdk/full/model/BlockChat;)V", "Lcom/yandex/mobile/drive/sdk/full/model/Details;", "a", "()Lcom/yandex/mobile/drive/sdk/full/model/Details;", "setDetails", "(Lcom/yandex/mobile/drive/sdk/full/model/Details;)V", "Lcom/yandex/mobile/drive/sdk/full/model/BlockChat;", "b", "()Lcom/yandex/mobile/drive/sdk/full/model/BlockChat;", "setShow_chat", "(Lcom/yandex/mobile/drive/sdk/full/model/BlockChat;)V", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class User {

    @ysq0("details")
    private Details details;

    @ysq0("show_chat")
    private BlockChat show_chat;

    public User(Details details, BlockChat blockChat) {
        this.details = details;
        this.show_chat = blockChat;
    }

    /* renamed from: a, reason: from getter */
    public final Details getDetails() {
        return this.details;
    }

    /* renamed from: b, reason: from getter */
    public final BlockChat getShow_chat() {
        return this.show_chat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return jl40.l(this.details, user.details) && jl40.l(this.show_chat, user.show_chat);
    }

    public final int hashCode() {
        Details details = this.details;
        int hashCode = (details == null ? 0 : details.hashCode()) * 31;
        BlockChat blockChat = this.show_chat;
        return hashCode + (blockChat != null ? blockChat.hashCode() : 0);
    }

    public final String toString() {
        return "User(details=" + this.details + ", show_chat=" + this.show_chat + Extension.C_BRAKE;
    }
}
