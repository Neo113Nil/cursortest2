package com.vkontakte.android.data;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.contacts.d;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.subscription.impl.RxUsersSubscriptionBusImpl;
import xsna.asp;
import xsna.e43;
import xsna.g620;
import xsna.hf8;
import xsna.kym0;
import xsna.n2i0;
import xsna.xwk;
import xsna.zrp;

/* compiled from: FriendsUtils.kt */
/* loaded from: classes7.dex */
public final class FriendsUtils {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FriendsUtils.kt */
    public static final class Request {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Request[] $VALUES;
        public static final Request IN;
        public static final Request OUT;
        public static final Request SUGGEST;

        static {
            Request request = new Request("IN", 0);
            IN = request;
            Request request2 = new Request("OUT", 1);
            OUT = request2;
            Request request3 = new Request("SUGGEST", 2);
            SUGGEST = request3;
            Request[] requestArr = {request, request2, request3};
            $VALUES = requestArr;
            $ENTRIES = new asp(requestArr);
        }

        public Request() {
            throw null;
        }

        public static Request valueOf(String str) {
            return (Request) Enum.valueOf(Request.class, str);
        }

        public static Request[] values() {
            return (Request[]) $VALUES.clone();
        }
    }

    public static final void a(int i) {
        Intent intent = new Intent("com.vkontakte.android.FRIEND_REQUESTS_CHANGED");
        g620.r(g620.f - i);
        intent.putExtra("value", g620.f);
        intent.putExtra("decrease", true);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        n2i0.a(context, hf8.a, intent);
    }

    public static final String b(UserProfile userProfile, int i) {
        Bundle bundle = userProfile.s;
        if (userProfile.C()) {
            return userProfile.e;
        }
        if (i == 0) {
            return userProfile.e;
        }
        if (i == 1) {
            return bundle.getString("name_gen");
        }
        if (i == 2) {
            return bundle.getString("name_dat");
        }
        if (i == 3) {
            return bundle.getString("name_acc");
        }
        if (i == 4) {
            return bundle.getString("name_ins");
        }
        if (i == 5) {
            return bundle.getString("name_abl");
        }
        switch (i) {
            case 10:
                return userProfile.d;
            case 11:
                return bundle.getString("first_name_gen");
            case 12:
                return bundle.getString("first_name_dat");
            case 13:
                return bundle.getString("first_name_acc");
            case 14:
                return bundle.getString("first_name_ins");
            case 15:
                return bundle.getString("first_name_abl");
            default:
                return null;
        }
    }

    public static final void c(int i, Request request) {
        Intent intent = new Intent("com.vkontakte.android.FRIEND_COUNTER_CHANGED");
        intent.putExtra("value", i);
        intent.putExtra("type", request);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        n2i0.a(context, hf8.a, intent);
    }

    public static final void d(int i, UserId userId) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        n2i0.a(context, hf8.a, new Intent("com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED").putExtra("id", userId).putExtra("status", i));
        RxUsersSubscriptionBusImpl m = xwk.e().T().m();
        SubscribeStatus.Companion.getClass();
        m.b(new kym0(SubscribeStatus.a.a(i), userId, null, Peer.Type.USER));
        d.a.K0(false);
    }

    public static final void e(int i) {
        Intent intent = new Intent("com.vkontakte.android.FRIEND_REQUESTS_CHANGED");
        intent.putExtra("value", i);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        n2i0.a(context, hf8.a, intent);
    }
}
