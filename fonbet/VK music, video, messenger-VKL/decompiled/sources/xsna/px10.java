package xsna;

import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.vw10;

/* compiled from: MediaRouter2Utils.java */
/* loaded from: classes12.dex */
public final class px10 {

    /* compiled from: MediaRouter2Utils.java */
    public static final class a {
        public static Set<String> a(MediaRoute2Info mediaRoute2Info) {
            return mediaRoute2Info.getDeduplicationIds();
        }

        public static int b(MediaRoute2Info mediaRoute2Info) {
            return mediaRoute2Info.getType();
        }
    }

    @NonNull
    public static ArrayList a(@Nullable List list) {
        String id;
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info a2 = aw10.a(it.next());
            if (a2 != null) {
                id = a2.getId();
                arrayList.add(id);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vw10 b(@Nullable MediaRoute2Info mediaRoute2Info) {
        String id;
        CharSequence name;
        int connectionState;
        int volumeHandling;
        int volumeMax;
        int volume;
        Bundle extras;
        int i;
        CharSequence description;
        Uri iconUri;
        Bundle extras2;
        Bundle bundle;
        ArrayList parcelableArrayList;
        if (mediaRoute2Info != null) {
            id = mediaRoute2Info.getId();
            name = mediaRoute2Info.getName();
            vw10.a aVar = new vw10.a(id, name.toString());
            connectionState = mediaRoute2Info.getConnectionState();
            Bundle bundle2 = aVar.a;
            bundle2.putInt("connectionState", connectionState);
            volumeHandling = mediaRoute2Info.getVolumeHandling();
            bundle2.putInt("volumeHandling", volumeHandling);
            volumeMax = mediaRoute2Info.getVolumeMax();
            bundle2.putInt("volumeMax", volumeMax);
            volume = mediaRoute2Info.getVolume();
            bundle2.putInt("volume", volume);
            extras = mediaRoute2Info.getExtras();
            if (extras == null) {
                bundle2.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, null);
            } else {
                bundle2.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, new Bundle(extras));
            }
            bundle2.putBoolean("enabled", true);
            bundle2.putBoolean("canDisconnect", false);
            if (Build.VERSION.SDK_INT >= 34) {
                bundle2.putStringArrayList("deduplicationIds", new ArrayList<>(a.a(mediaRoute2Info)));
                int b = a.b(mediaRoute2Info);
                i = 2;
                if (b == 2) {
                    i = 12;
                } else if (b == 3) {
                    i = 13;
                } else if (b == 4) {
                    i = 14;
                } else if (b == 22) {
                    i = 20;
                } else if (b == 23) {
                    i = 21;
                } else if (b == 26) {
                    i = 22;
                } else if (b == 29) {
                    i = 24;
                } else if (b != 2000) {
                    switch (b) {
                        case 8:
                            i = 3;
                            break;
                        case 9:
                            i = 16;
                            break;
                        case 10:
                            i = 23;
                            break;
                        case 11:
                            i = 17;
                            break;
                        case 12:
                            i = 18;
                            break;
                        case 13:
                            i = 19;
                            break;
                        default:
                            switch (b) {
                                case 1001:
                                    i = 1;
                                    break;
                                case 1003:
                                    i = 4;
                                    break;
                                case 1004:
                                    i = 5;
                                    break;
                                case 1005:
                                    i = 6;
                                    break;
                                case 1006:
                                    i = 7;
                                    break;
                                case 1007:
                                    i = 8;
                                    break;
                                case 1008:
                                    i = 9;
                                    break;
                                case 1009:
                                    i = 10;
                                    break;
                                case 1010:
                                    i = 11;
                                    break;
                            }
                    }
                } else {
                    i = 1000;
                }
                description = mediaRoute2Info.getDescription();
                if (description != null) {
                    bundle2.putString("status", description.toString());
                }
                iconUri = mediaRoute2Info.getIconUri();
                if (iconUri != null) {
                    bundle2.putString("iconUri", iconUri.toString());
                }
                extras2 = mediaRoute2Info.getExtras();
                if (extras2 != null && extras2.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras2.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras2.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
                    bundle = extras2.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                    if (bundle != null) {
                        bundle2.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, null);
                    } else {
                        bundle2.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, new Bundle(bundle));
                    }
                    if (i == 0) {
                        i = extras2.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0);
                    }
                    bundle2.putInt("deviceType", i);
                    bundle2.putInt("playbackType", extras2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                    parcelableArrayList = extras2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                    if (parcelableArrayList != null) {
                        aVar.a(parcelableArrayList);
                    }
                    return aVar.b();
                }
            }
            i = 0;
            description = mediaRoute2Info.getDescription();
            if (description != null) {
            }
            iconUri = mediaRoute2Info.getIconUri();
            if (iconUri != null) {
            }
            extras2 = mediaRoute2Info.getExtras();
            if (extras2 != null) {
                bundle = extras2.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                if (bundle != null) {
                }
                if (i == 0) {
                }
                bundle2.putInt("deviceType", i);
                bundle2.putInt("playbackType", extras2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                parcelableArrayList = extras2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                if (parcelableArrayList != null) {
                }
                return aVar.b();
            }
        }
        return null;
    }
}
