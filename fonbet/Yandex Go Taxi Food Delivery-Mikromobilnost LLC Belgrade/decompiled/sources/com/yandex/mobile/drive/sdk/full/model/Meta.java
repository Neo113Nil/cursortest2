package com.yandex.mobile.drive.sdk.full.model;

import defpackage.jl40;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/model/Meta;", "", "", UgcLiveVideoData.UgcLiveStatus.FINISHED, "<init>", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Meta {

    @ysq0(UgcLiveVideoData.UgcLiveStatus.FINISHED)
    private final Boolean finished;

    public Meta(Boolean bool) {
        this.finished = bool;
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getFinished() {
        return this.finished;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Meta) && jl40.l(this.finished, ((Meta) obj).finished);
    }

    public final int hashCode() {
        Boolean bool = this.finished;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "Meta(finished=" + this.finished + Extension.C_BRAKE;
    }
}
