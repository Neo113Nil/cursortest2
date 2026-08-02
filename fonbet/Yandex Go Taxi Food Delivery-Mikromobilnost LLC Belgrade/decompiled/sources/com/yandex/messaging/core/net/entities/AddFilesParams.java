package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/AddFilesParams;", "", "chatId", "", "files", "", "Lcom/yandex/messaging/core/net/entities/AddFilesParam;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getChatId", "()Ljava/lang/String;", "getFiles", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AddFilesParams {
    private final String chatId;
    private final List<AddFilesParam> files;

    public AddFilesParams(@Json(name = "chat_id") String str, @Json(name = "files") List<AddFilesParam> list) {
        this.chatId = str;
        this.files = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddFilesParams copy$default(AddFilesParams addFilesParams, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addFilesParams.chatId;
        }
        if ((i & 2) != 0) {
            list = addFilesParams.files;
        }
        return addFilesParams.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    public final List<AddFilesParam> component2() {
        return this.files;
    }

    public final AddFilesParams copy(@Json(name = "chat_id") String chatId, @Json(name = "files") List<AddFilesParam> files) {
        return new AddFilesParams(chatId, files);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddFilesParams)) {
            return false;
        }
        AddFilesParams addFilesParams = (AddFilesParams) other;
        return jl40.l(this.chatId, addFilesParams.chatId) && jl40.l(this.files, addFilesParams.files);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final List<AddFilesParam> getFiles() {
        return this.files;
    }

    public int hashCode() {
        return this.files.hashCode() + (this.chatId.hashCode() * 31);
    }

    public String toString() {
        return nnm.h("AddFilesParams(chatId=", this.chatId, ", files=", Extension.C_BRAKE, this.files);
    }
}
