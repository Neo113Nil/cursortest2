package com.vk.webapp.bridges.features.audio;

import android.content.Context;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.NftAudio;
import com.vk.log.L;
import com.vk.movika.sdk.android.defaultplayer.interactive.c;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.webapp.bridges.features.audio.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bex0;
import xsna.e43;
import xsna.epx;
import xsna.fkq0;
import xsna.fl4;
import xsna.fvv0;
import xsna.lqk0;
import xsna.lyd;
import xsna.onx;
import xsna.rl3;
import xsna.s3q0;
import xsna.u2b0;

/* compiled from: WebAudioDelegate.kt */
/* loaded from: classes7.dex */
public final class b implements a.InterfaceC2095a {
    public static final Set<VkUiAudioType> b = rl3.y0(new VkUiAudioType[]{VkUiAudioType.PODCAST, VkUiAudioType.NFT});
    public static final Set<Integer> c = Collections.singleton(Integer.valueOf((int) InternalVkMiniApps.NFTS.h().a));
    public static final ReentrantLock d = new ReentrantLock();
    public static a e;
    public final onx a;

    /* compiled from: WebAudioDelegate.kt */
    public final class a implements a.InterfaceC2095a {
        public final int a;
        public boolean b = true;

        /* compiled from: WebAudioDelegate.kt */
        /* renamed from: com.vk.webapp.bridges.features.audio.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2096a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PlayState.values().length];
                try {
                    iArr[PlayState.STOPPED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(int i) {
            this.a = i;
        }

        @Override // com.vk.webapp.bridges.features.audio.a.InterfaceC2095a
        public final void a(PlayState playState) {
            if (this.b) {
                bex0.a.b(b.this.a, JsApiMethodType.AUDIO_GET_STATUS, b.b(this.a), null, 12);
                if (C2096a.$EnumSwitchMapping$0[playState.ordinal()] == 1) {
                    ReentrantLock reentrantLock = b.d;
                    reentrantLock.lock();
                    try {
                        b.e = null;
                        this.b = false;
                        s3q0 s3q0Var = s3q0.a;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            }
        }
    }

    /* compiled from: WebAudioDelegate.kt */
    /* renamed from: com.vk.webapp.bridges.features.audio.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C2097b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PlayState.values().length];
            try {
                iArr[PlayState.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayState.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayState.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayState.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkUiAudioType.values().length];
            try {
                iArr2[VkUiAudioType.PODCAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VkUiAudioType.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VkUiAudioType.NFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VkUiAudioType.FILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public b(onx onxVar) {
        this.a = onxVar;
    }

    public static JSONObject b(int i) {
        Object valueOf;
        JSONObject jSONObject = new JSONObject();
        com.vk.webapp.bridges.features.audio.a aVar = com.vk.webapp.bridges.features.audio.a.a;
        u2b0 u2b0Var = com.vk.webapp.bridges.features.audio.a.c;
        MusicTrack b2 = u2b0Var.b();
        a.b bVar = com.vk.webapp.bridges.features.audio.a.e;
        if (b2 == null || bVar == null || !com.vk.webapp.bridges.features.audio.a.a(i)) {
            jSONObject.put("status", "STOPPED".toLowerCase(Locale.ROOT));
            return jSONObject;
        }
        PlayState m0 = u2b0Var.m0();
        int i2 = C2097b.$EnumSwitchMapping$0[m0.ordinal()];
        if (i2 == 1 || i2 == 2) {
            jSONObject.put("status", "STOPPED".toLowerCase(Locale.ROOT));
            return jSONObject;
        }
        if (i2 != 3 && i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        jSONObject.put("status", m0.name().toLowerCase(Locale.ROOT));
        jSONObject.put(X3.i.L, u2b0Var.C1());
        jSONObject.put("type", bVar.b.h());
        NftAudio nftAudio = b2.x;
        if (nftAudio == null || (valueOf = nftAudio.b) == null) {
            valueOf = Integer.valueOf(b2.b);
        }
        jSONObject.put("id", valueOf);
        return jSONObject;
    }

    @Override // com.vk.webapp.bridges.features.audio.a.InterfaceC2095a
    public final void a(PlayState playState) {
        int i = C2097b.$EnumSwitchMapping$0[playState.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final Integer c() {
        fvv0 M = this.a.M();
        if (M != null) {
            return Integer.valueOf((int) M.getAppId());
        }
        return null;
    }

    public final boolean d() {
        fvv0 M = this.a.M();
        if (M == null) {
            return false;
        }
        if (M.S()) {
            return M.t().B;
        }
        return true;
    }

    public final void e(JSONObject jSONObject) {
        VkUiAudioType vkUiAudioType;
        ArrayList arrayList;
        MusicTrack musicTrack;
        int i;
        Object obj;
        int i2;
        Object obj2;
        JSONObject optJSONObject;
        onx onxVar = this.a;
        Integer c2 = c();
        if (c2 == null) {
            bex0.a.a(onxVar, JsApiMethodType.AUDIO_RESUME, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
            return;
        }
        int intValue = c2.intValue();
        String optString = jSONObject.optString("type");
        if (optString.length() == 0) {
            bex0.a.a(onxVar, JsApiMethodType.AUDIO_PLAY, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            return;
        }
        VkUiAudioType.Companion.getClass();
        VkUiAudioType[] values = VkUiAudioType.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                vkUiAudioType = VkUiAudioType.UNKNOWN;
                break;
            }
            vkUiAudioType = values[i3];
            if (epx.f(vkUiAudioType.h(), optString)) {
                break;
            } else {
                i3++;
            }
        }
        if (!b.contains(vkUiAudioType)) {
            bex0.a.a(onxVar, JsApiMethodType.AUDIO_PLAY, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            return;
        }
        if (vkUiAudioType == VkUiAudioType.NFT && !c.contains(c2)) {
            bex0.a.a(onxVar, JsApiMethodType.AUDIO_PLAY, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("playlist");
        int i4 = -1;
        if (optJSONArray != null) {
            ArrayList arrayList2 = new ArrayList(optJSONArray.length());
            int length2 = optJSONArray.length();
            int i5 = 0;
            while (i5 < length2) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i5);
                MusicTrack musicTrack2 = new MusicTrack(0, null, null, null, 0, 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -1, 1048575, null);
                int optInt = jSONObject2.optInt("id", i4);
                musicTrack2.b = optInt;
                if (optInt >= 0) {
                    String optString2 = jSONObject2.optString("url");
                    musicTrack2.i = optString2;
                    if (optString2 != null && optString2.length() != 0) {
                        int optInt2 = jSONObject2.optInt("duration", i4);
                        musicTrack2.f = optInt2;
                        if (optInt2 >= 0) {
                            musicTrack2.r = jSONObject2.optString("access_key");
                            musicTrack2.d = jSONObject2.optString("title");
                            musicTrack2.h = jSONObject2.optString("artist");
                            musicTrack2.y = jSONObject2.optString("track_code");
                            if (vkUiAudioType == VkUiAudioType.PODCAST || vkUiAudioType == VkUiAudioType.AUDIO) {
                                UserId userId = new UserId(jSONObject2.optLong("owner_id"));
                                musicTrack2.c = userId;
                                if (!fkq0.c(userId)) {
                                }
                            }
                            int i6 = C2097b.$EnumSwitchMapping$1[vkUiAudioType.ordinal()];
                            if (i6 == 1) {
                                JSONObject optJSONObject2 = jSONObject2.optJSONObject("podcast_info");
                                if (optJSONObject2 != null) {
                                    Serializer.c<Episode> cVar = Episode.CREATOR;
                                    musicTrack2.w = Episode.a.a(optJSONObject2);
                                }
                            } else if (i6 == 3 && (optJSONObject = jSONObject2.optJSONObject("nft_info")) != null) {
                                Serializer.c<NftAudio> cVar2 = NftAudio.CREATOR;
                                musicTrack2.x = NftAudio.a.a(optJSONObject);
                            }
                            arrayList2.add(musicTrack2);
                            i5++;
                            i4 = -1;
                        }
                    }
                }
                arrayList2 = null;
                break;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            bex0.a.a(onxVar, JsApiMethodType.AUDIO_PLAY, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
            return;
        }
        String optString3 = jSONObject.optString("start_audio");
        if (optString3.length() > 0) {
            int i7 = C2097b.$EnumSwitchMapping$1[vkUiAudioType.ordinal()];
            if (i7 == 1 || i7 == 2) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (epx.f(((MusicTrack) obj).Fb(), optString3)) {
                            break;
                        }
                    }
                }
                musicTrack = (MusicTrack) obj;
            } else if (i7 == 3 || i7 == 4) {
                try {
                    i2 = Integer.parseInt(optString3);
                } catch (NumberFormatException e2) {
                    L.i(e2);
                    i2 = -1;
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it2.next();
                        if (((MusicTrack) obj2).b == i2) {
                            break;
                        }
                    }
                }
                musicTrack = (MusicTrack) obj2;
            } else {
                musicTrack = null;
            }
            if (musicTrack == null) {
                bex0.a.a(onxVar, JsApiMethodType.AUDIO_PLAY, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                return;
            }
        } else {
            musicTrack = null;
        }
        int optInt3 = jSONObject.optInt(X3.i.L, -1);
        if (optInt3 <= 0) {
            i = 0;
        } else if (musicTrack == null) {
            bex0.a.a(onxVar, JsApiMethodType.AUDIO_PLAY, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            return;
        } else {
            if (optInt3 > musicTrack.f) {
                bex0.a.a(onxVar, JsApiMethodType.AUDIO_PLAY, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                return;
            }
            i = optInt3 * 1000;
        }
        VkUiAudioType vkUiAudioType2 = VkUiAudioType.NFT;
        if (vkUiAudioType == vkUiAudioType2) {
            ReentrantLock reentrantLock = d;
            reentrantLock.lock();
            try {
                if (e == null) {
                    a aVar = new a(intValue);
                    e = aVar;
                    synchronized (com.vk.webapp.bridges.features.audio.a.a) {
                        com.vk.webapp.bridges.features.audio.a.b.add(new WeakReference<>(aVar));
                    }
                    e = aVar;
                }
                s3q0 s3q0Var = s3q0.a;
            } finally {
                reentrantLock.unlock();
            }
        }
        com.vk.webapp.bridges.features.audio.a.e = new a.b(intValue, vkUiAudioType);
        u2b0 u2b0Var = com.vk.webapp.bridges.features.audio.a.c;
        MusicPlaybackLaunchContext zb = MusicPlaybackLaunchContext.d.zb();
        zb.b.putInt("__META_PLAYER_MINI_APP_SOURCE", intValue);
        u2b0Var.N0(new lqk0((StartPlaySource) null, musicTrack, arrayList, zb, i, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 977));
        if (vkUiAudioType != vkUiAudioType2) {
            fl4 g = lyd.g();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            int i8 = fl4.a;
            g.x(context, false);
        }
        bex0.a.b(onxVar, JsApiMethodType.AUDIO_PLAY, c.b("result", true), null, 12);
    }
}
