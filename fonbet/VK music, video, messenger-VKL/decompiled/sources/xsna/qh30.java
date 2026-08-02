package xsna;

import com.vk.im.engine.models.messages.MsgChatOwnerUpdate;
import com.vk.im.engine.models.messages.MsgServiceCustom;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: MsgBuilder.kt */
/* loaded from: classes2.dex */
public final class qh30 {

    /* compiled from: MsgBuilder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MsgChatOwnerUpdate.Type.values().length];
            try {
                iArr[MsgChatOwnerUpdate.Type.CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgChatOwnerUpdate.Type.ANY_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MsgChatOwnerUpdate.Type.ADMIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MsgChatOwnerUpdate.Type.ANY_ADMIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AdapterEntryType.values().length];
            try {
                iArr2[AdapterEntryType.TYPE_PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AdapterEntryType.TYPE_GIF_AUTOPLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AdapterEntryType.TYPE_DOC_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AdapterEntryType.TYPE_POLL.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AdapterEntryType.TYPE_BOX_PHOTO_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AdapterEntryType.TYPE_AUDIO.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[AdapterEntryType.TYPE_ARTIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[AdapterEntryType.TYPE_PLAYLIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[AdapterEntryType.TYPE_PUBLIC_VIDEO.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final nur0 a(MsgServiceCustom msgServiceCustom, o040 o040Var, uk30 uk30Var) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_SERVICE_CUSTOM;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c a2 = com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.a(msgServiceCustom, uk30Var.l);
        CharSequence a3 = o040.a(o040Var, msgServiceCustom.E, 14);
        boolean z = uk30Var.q;
        bw30.a.getClass();
        nur0 nur0Var = new nur0(a2, z, a3, adapterEntryType, bw30.b(msgServiceCustom), null);
        nur0Var.h = msgServiceCustom;
        return nur0Var;
    }
}
