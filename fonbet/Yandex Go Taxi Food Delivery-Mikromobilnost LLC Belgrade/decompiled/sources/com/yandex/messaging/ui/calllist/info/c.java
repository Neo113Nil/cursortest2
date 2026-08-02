package com.yandex.messaging.ui.calllist.info;

import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.telemost.domain.entities.CallHistoryData;
import defpackage.cc7;
import defpackage.ds31;
import defpackage.e3n;
import defpackage.g92;
import defpackage.gvg0;
import defpackage.hft;
import defpackage.i3y;
import defpackage.i4t;
import defpackage.j4t;
import defpackage.jx81;
import defpackage.k5c;
import defpackage.kp50;
import defpackage.nft;
import defpackage.o430;
import defpackage.p8b;
import defpackage.rbt;
import defpackage.rk6;
import defpackage.sc5;
import defpackage.sh7;
import defpackage.tft;
import defpackage.th7;
import defpackage.tpr;
import defpackage.w270;
import defpackage.w511;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Pair;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes15.dex */
public final class c extends sc5 {
    public final String w;
    public final ExistingChatRequest x;
    public final i3y y;

    public c(th7 th7Var, tft tftVar, rbt rbtVar, hft hftVar, nft nftVar, j4t j4tVar, w270 w270Var) {
        String chatId;
        String remoteGuid;
        tpr a;
        tpr a2;
        CallHistoryData callHistoryData = th7Var.b;
        boolean z = callHistoryData instanceof CallHistoryData.GroupCall;
        if (z) {
            chatId = ((CallHistoryData.GroupCall) callHistoryData).getChatId();
        } else {
            if (!(callHistoryData instanceof CallHistoryData.OneToOneCall)) {
                w511.b();
                throw null;
            }
            chatId = ((CallHistoryData.OneToOneCall) callHistoryData).getChatId();
        }
        this.w = chatId;
        CallHistoryData.GroupCall groupCall = z ? (CallHistoryData.GroupCall) callHistoryData : null;
        if (groupCall != null) {
            groupCall.getTelemostJoinUrl();
        }
        if (z) {
            remoteGuid = null;
        } else {
            if (!(callHistoryData instanceof CallHistoryData.OneToOneCall)) {
                w511.b();
                throw null;
            }
            remoteGuid = ((CallHistoryData.OneToOneCall) callHistoryData).getRemoteGuid();
        }
        ExistingChatRequest a3 = chatId != null ? p8b.a(chatId) : null;
        this.x = a3;
        this.y = kotlin.a.a(new rk6(6, this));
        m0 m0Var = new m0((remoteGuid == null || (a2 = tftVar.a(remoteGuid)) == null) ? new g92(2, null) : a2, remoteGuid != null ? e.X(new cc7(rbtVar.a(zy11.a), remoteGuid, 9), new CallHistoryInfoViewModel$contactStateFlow$lambda$7$$inlined$flatMapLatest$1(null, nftVar, remoteGuid, hftVar)) : new g92(2, new Pair(null, null)), new CallHistoryInfoViewModel$state$1(this, null));
        k5c a4 = ds31.a(this);
        wsr0 wsr0Var = xsr0.a;
        o430 o430Var = e3n.b;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        e.R(m0Var, a4, jx81.a(2, kp50.U(5, durationUnit)), new sh7(0));
        if (a3 == null || (a = j4tVar.a(new i4t(a3, gvg0.avatar_size_108))) == null) {
            Collections.singletonList(null);
        } else {
            e.R(a, ds31.a(this), jx81.a(2, kp50.U(5, durationUnit)), null);
        }
    }
}
