package com.yandex.mobile.drive.sdk.full.model;

import defpackage.jl40;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/model/BlockChat;", "", "", "id", "", "closable", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "setClosable", "(Ljava/lang/Boolean;)V", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BlockChat {

    @ysq0("is_closable")
    private Boolean closable;

    @ysq0("id")
    private String id;

    public BlockChat(String str, Boolean bool) {
        this.id = str;
        this.closable = bool;
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getClosable() {
        return this.closable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockChat)) {
            return false;
        }
        BlockChat blockChat = (BlockChat) obj;
        return jl40.l(this.id, blockChat.id) && jl40.l(this.closable, blockChat.closable);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.closable;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BlockChat(id=" + this.id + ", closable=" + this.closable + Extension.C_BRAKE;
    }
}
