package com.yandex.go.payments.shared.members.list;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\f\u0010\nR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\nj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/payments/shared/members/list/MemberListMode;", "", "", "analyticContext", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "", "isInWizard", "Z", "()Z", "showLimits", "f", "showMySelf", "g", "canDeleteUsers", "b", "showBackButton", "c", "WIZARD_ADD_PARTICIPANTS_STEP", "WIZARD_EDIT_ACCOUNT", "LIMITS", "DETAILS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MemberListMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MemberListMode[] $VALUES;
    public static final MemberListMode DETAILS;
    public static final MemberListMode LIMITS;
    public static final MemberListMode WIZARD_ADD_PARTICIPANTS_STEP;
    public static final MemberListMode WIZARD_EDIT_ACCOUNT;
    private final String analyticContext;
    private final boolean canDeleteUsers;
    private final boolean isInWizard;
    private final boolean showBackButton;
    private final boolean showLimits;
    private final boolean showMySelf;

    static {
        MemberListMode memberListMode = new MemberListMode("WIZARD_ADD_PARTICIPANTS_STEP", 0, "wizard", true, false, true, true, false);
        WIZARD_ADD_PARTICIPANTS_STEP = memberListMode;
        MemberListMode memberListMode2 = new MemberListMode("WIZARD_EDIT_ACCOUNT", 1, "wizard", true, false, true, true, true);
        WIZARD_EDIT_ACCOUNT = memberListMode2;
        MemberListMode memberListMode3 = new MemberListMode("LIMITS", 2, "settings", false, true, false, false, true);
        LIMITS = memberListMode3;
        MemberListMode memberListMode4 = new MemberListMode("DETAILS", 3, "details", false, false, true, true, true);
        DETAILS = memberListMode4;
        MemberListMode[] memberListModeArr = {memberListMode, memberListMode2, memberListMode3, memberListMode4};
        $VALUES = memberListModeArr;
        $ENTRIES = kotlin.enums.a.a(memberListModeArr);
    }

    public MemberListMode(String str, int i, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.analyticContext = str2;
        this.isInWizard = z;
        this.showLimits = z2;
        this.showMySelf = z3;
        this.canDeleteUsers = z4;
        this.showBackButton = z5;
    }

    public static MemberListMode valueOf(String str) {
        return (MemberListMode) Enum.valueOf(MemberListMode.class, str);
    }

    public static MemberListMode[] values() {
        return (MemberListMode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticContext() {
        return this.analyticContext;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getCanDeleteUsers() {
        return this.canDeleteUsers;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getShowLimits() {
        return this.showLimits;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getShowMySelf() {
        return this.showMySelf;
    }
}
