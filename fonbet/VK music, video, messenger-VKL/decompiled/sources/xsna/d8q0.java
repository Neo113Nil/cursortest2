package xsna;

import android.content.Context;
import android.net.Uri;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.text.Regex;

/* compiled from: EmojiUpdater.kt */
/* loaded from: classes.dex */
public final class d8q0 extends tsl {
    public final fyx c;

    public d8q0(fyx fyxVar) {
        super(fyxVar);
        this.c = fyxVar;
    }

    @Override // xsna.tsl
    public final void a(Context context) {
        int i;
        boolean z;
        boolean z2;
        File file;
        ucp ucpVar = ucp.a;
        int integer = context.getResources().getInteger(R.integer.vk_emoji_size_in_sprite_if_downloaded);
        if (integer == 0) {
            L.e("UpdateEmojiSpritesDelayedJob", "Updating emoji sprites version: 20260421165200 not required for current DPI");
            return;
        }
        L.e("UpdateEmojiSpritesDelayedJob", lhg.a(integer, "Start updating emoji sprites version: 20260421165200 required size: "));
        l9r l9rVar = new l9r(new File(com.vk.core.files.a.j(), "emoji_sprites_assets"), ServiceProvider.HTTP_CACHE_DISK_SIZE);
        asu0.a.getClass();
        wel welVar = new wel(l9rVar, asu0.q(), new a());
        File file2 = new File(e43.a.getFilesDir().getAbsolutePath() + "/emoji_sprites_assets");
        int integer2 = context.getResources().getInteger(R.integer.vk_emoji_size_in_sprite_if_downloaded);
        File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            z = true;
            for (File file3 : listFiles) {
                if (file3.getName().equals("sprites_20260421165200")) {
                    File[] listFiles2 = file3.listFiles();
                    if (listFiles2 != null) {
                        int length = listFiles2.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                z2 = true;
                                file = null;
                                break;
                            } else {
                                file = listFiles2[i2];
                                z2 = true;
                                if (file.getName().equals(String.valueOf(integer2))) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        if (file != null) {
                            File[] listFiles3 = file.listFiles();
                            z = !((listFiles3 == null || listFiles3.length != 25) ? false : z2);
                        }
                    }
                } else {
                    try {
                        nbr.l(file3);
                        L.e("UpdateEmojiSpritesDelayedJob", "Old version of emoji folder is deleted: " + file3.getName());
                    } catch (Exception unused) {
                        L.e("UpdateEmojiSpritesDelayedJob", "Old version of emoji folder is not deleted because of error. Filename: " + file3.getName());
                    }
                }
            }
            i = 1;
        } else {
            i = 1;
            z = true;
        }
        if (!z) {
            L.e("UpdateEmojiSpritesDelayedJob", "Emoji sprites are up to date");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = 0;
        while (i3 < 25) {
            ucp ucpVar2 = ucp.a;
            String format = String.format("https://%s/images/all_emoji/sprites_20260421165200/%s/emoji_sprite_%s.webp", Arrays.copyOf(new Object[]{a0a.d, Integer.valueOf(integer), Integer.valueOf(i3)}, 3));
            String y = brm0.y(format, String.format("https://%s/images/all_emoji", Arrays.copyOf(new Object[]{a0a.d}, i)), "");
            File a2 = welVar.a(Uri.parse(format), y);
            L.e("UpdateEmojiSpritesDelayedJob", "emoji file url: ".concat(format));
            linkedHashMap.put(y, a2);
            i3++;
            i = 1;
        }
        if (linkedHashMap.keySet().size() != 25) {
            L.e("UpdateEmojiSpritesDelayedJob", "Emoji update not successful");
            return;
        }
        for (String str : linkedHashMap.keySet()) {
            StringBuilder sb = new StringBuilder();
            Regex regex = com.vk.core.files.a.a;
            sb.append(e43.a.getFilesDir().getAbsolutePath());
            sb.append("/emoji_sprites_assets");
            sb.append(str);
            File file4 = new File(sb.toString());
            File file5 = (File) linkedHashMap.get(str);
            if (file5 != null) {
                nbr.k(file5, file4, true, 4);
                L.e("UpdateEmojiSpritesDelayedJob", "emoji file size: " + file4.length());
            }
        }
        L.e("UpdateEmojiSpritesDelayedJob", "Emoji update successful");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d8q0) && epx.f(this.c, ((d8q0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "UpdateEmojiSpritesDelayedJob(args=" + this.c + ')';
    }

    /* compiled from: EmojiUpdater.kt */
    public static final class a implements cpz {
        @Override // xsna.cpz
        public final void a(Uri uri, Throwable th) {
            L.e("UpdateEmojiSpritesDelayedJob", "Failed to download emoji sprite " + uri + ' ' + th);
        }

        @Override // xsna.cpz
        public final void b(Uri uri, File file, long j, long j2, int i, String str) {
        }
    }
}
