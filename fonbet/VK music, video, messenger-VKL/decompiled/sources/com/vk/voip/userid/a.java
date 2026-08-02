package com.vk.voip.userid;

import com.vk.dto.common.id.UserId;
import com.vk.voip.userid.CallsUserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.fkq0;

/* compiled from: CallsUserId.kt */
/* loaded from: classes7.dex */
public final class a {
    public static final boolean a(CallsUserId callsUserId) {
        if (callsUserId instanceof CallsUserId.VkUserId) {
            return fkq0.b(((CallsUserId.VkUserId) callsUserId).b);
        }
        if (callsUserId instanceof CallsUserId.ContactId) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final UserId b(CallsUserId callsUserId) {
        if (callsUserId instanceof CallsUserId.VkUserId) {
            return ((CallsUserId.VkUserId) callsUserId).b;
        }
        if (callsUserId instanceof CallsUserId.ContactId) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
