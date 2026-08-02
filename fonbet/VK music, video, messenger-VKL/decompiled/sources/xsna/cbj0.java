package xsna;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.sharing.api.dto.SharingDataType;
import com.vk.sharing.core.SharingActivity;
import com.vkontakte.android.R;
import java.util.HashMap;

/* compiled from: Sharing.kt */
@ozl
/* loaded from: classes5.dex */
public final class cbj0 {
    public static a a;

    /* compiled from: Sharing.kt */
    public static final class a extends BroadcastReceiver {
        public final r9l a;

        public a(r9l r9lVar) {
            this.a = r9lVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            this.a.a(componentName != null ? componentName.getPackageName() : null);
            enj.s(context, this);
        }
    }

    /* compiled from: Sharing.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SharingDataType.values().length];
            try {
                iArr[SharingDataType.PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SharingDataType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SharingDataType.ARTIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SharingDataType.CLIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SharingDataType.POLL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SharingDataType.AUDIO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SharingDataType.PLAYLIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SharingDataType.ARTICLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SharingDataType.GOOD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SharingDataType.ALBUM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(Context context, String str) {
        e(context, str, SharingDataType.OTHER, true, null, null, null, null);
    }

    public static final void b(SharingActivity sharingActivity, SharingDataType sharingDataType, Serializer.StreamParcelable streamParcelable, String str, String str2, bcj0 bcj0Var, StorySharingInfo storySharingInfo, boolean z) {
        String str3;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("extra_data_type", sharingDataType.ordinal());
        switch (b.$EnumSwitchMapping$0[sharingDataType.ordinal()]) {
            case 1:
                str3 = "extra_photo";
                break;
            case 2:
            case 3:
                str3 = "extra_story_sharing_info";
                break;
            case 4:
                str3 = "extra_clip";
                break;
            case 5:
                str3 = "extra_poll";
                break;
            case 6:
                str3 = "extra_audio";
                break;
            case 7:
                str3 = "extra_playlist";
                break;
            case 8:
                str3 = "extra_article";
                break;
            case 9:
                str3 = "extra_good";
                break;
            case 10:
                str3 = "extra_album";
                break;
            default:
                str3 = null;
                break;
        }
        if (str3 != null) {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            intent.putExtra(str3, Serializer.b.e(streamParcelable));
        }
        intent.putExtra("extra_entry_point", str2);
        intent.putExtra("extra_can_post_story", z);
        if (storySharingInfo != null) {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
            intent.putExtra("extra_story_sharing_info", Serializer.b.e(storySharingInfo));
        }
        d(sharingActivity, intent, null, bcj0Var);
    }

    public static /* synthetic */ void c(SharingActivity sharingActivity, SharingDataType sharingDataType, Serializer.StreamParcelable streamParcelable, String str, String str2, bcj0 bcj0Var, StorySharingInfo storySharingInfo, int i) {
        if ((i & 64) != 0) {
            storySharingInfo = null;
        }
        b(sharingActivity, sharingDataType, streamParcelable, str, str2, bcj0Var, storySharingInfo, true);
    }

    public static final void d(Context context, Intent intent, String str, r9l r9lVar) {
        if (str != null) {
            intent.setPackage(str);
        } else if (r9lVar != null) {
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            String a2 = fo8.a(context2.getPackageName(), "_sharing");
            Intent intent2 = new Intent(a2);
            PendingIntent c = t2i0.c(intent2, context2, true, new r2i0(context2, 0, intent2, 1375731712));
            a aVar = a;
            if (aVar != null) {
                enj.s(context2, aVar);
            }
            a aVar2 = new a(r9lVar);
            a = aVar2;
            anj.d(context2, aVar2, new IntentFilter(a2), null, 2);
            intent = Intent.createChooser(intent, context2.getString(R.string.sharing_title1), c != null ? c.getIntentSender() : null);
        } else {
            intent = Intent.createChooser(intent, context.getString(R.string.sharing_title1));
        }
        if (context.getPackageManager().resolveActivity(intent, 0) != null) {
            context.startActivity(intent);
        }
    }

    public static final void e(Context context, String str, SharingDataType sharingDataType, boolean z, StorySharingInfo storySharingInfo, String str2, String str3, r9l r9lVar) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("extra_data_type", sharingDataType.ordinal());
        intent.putExtra("extra_can_post_user_wall", z);
        if (storySharingInfo != null) {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            intent.putExtra("extra_story_sharing_info", Serializer.b.e(storySharingInfo));
            intent.putExtra("extra_can_post_story", true);
        }
        if (str2 != null) {
            intent.putExtra("extra_entry_point", str2);
        }
        d(context, intent, str3, r9lVar);
    }
}
