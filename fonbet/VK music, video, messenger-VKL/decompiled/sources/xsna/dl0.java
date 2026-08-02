package xsna;

import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;

/* compiled from: AddContactsResourcesHelper.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class dl0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CommunityAddContactsState.ContactField.ContactViewType.values().length];
        try {
            iArr[CommunityAddContactsState.ContactField.ContactViewType.ADDRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CommunityAddContactsState.ContactField.ContactViewType.CITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CommunityAddContactsState.ContactField.ContactViewType.PHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CommunityAddContactsState.ContactField.ContactViewType.WEBSITE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
