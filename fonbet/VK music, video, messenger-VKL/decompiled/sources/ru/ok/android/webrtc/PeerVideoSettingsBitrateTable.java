package ru.ok.android.webrtc;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.e43;
import xsna.epx;
import xsna.j5g;
import xsna.jw5;
import xsna.on00;
import xsna.sl9;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class PeerVideoSettingsBitrateTable {
    public static final String CODEC_AV1 = "av1";
    public static final String CODEC_GENERIC = "generic";
    public static final String CODEC_VP8 = "vp8";
    public static final String CODEC_VP9 = "vp9";
    public static final Companion Companion = new Companion(null);
    public final Map a;

    public static final class Bitrate {
        public final int a;
        public final int b;

        public Bitrate(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public static /* synthetic */ Bitrate copy$default(Bitrate bitrate, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = bitrate.a;
            }
            if ((i3 & 2) != 0) {
                i2 = bitrate.b;
            }
            return bitrate.copy(i, i2);
        }

        public final int component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        public final Bitrate copy(int i, int i2) {
            return new Bitrate(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bitrate)) {
                return false;
            }
            Bitrate bitrate = (Bitrate) obj;
            return this.a == bitrate.a && this.b == bitrate.b;
        }

        public final int getBitrate() {
            return this.b;
        }

        public final int getDimension() {
            return this.a;
        }

        public int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public String toString() {
            return sl9.c(this.a, this.b, "Bitrate(dimension=", ", bitrate=", ")");
        }
    }

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public final PeerVideoSettingsBitrateTable defaultTable() {
            return new PeerVideoSettingsBitrateTable(on00.f(new Pair(PeerVideoSettingsBitrateTable.CODEC_GENERIC, e43.l(new Bitrate(160, 90000), new Bitrate(320, 180000), new Bitrate(480, 280000), new Bitrate(IronSourceError.ERROR_NO_INTERNET_CONNECTION, 400000), new Bitrate(640, 500000), new Bitrate(VideoRecord.DEFAULT_MAX_DIMENSION, 900000), new Bitrate(CoverVideoUploadTask.y, 1200000), new Bitrate(1920, 2500000), new Bitrate(2560, 3500000), new Bitrate(3840, 5000000)))));
        }

        public final PeerVideoSettingsBitrateTable fromJson(JSONObject jSONObject) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONArray names = jSONObject.names();
            if (names == null) {
                names = new JSONArray();
            }
            int length = names.length();
            for (int i = 0; i < length; i++) {
                String string = names.getString(i);
                JSONArray jSONArray = jSONObject.getJSONArray(string);
                ArrayList arrayList = new ArrayList();
                int length2 = jSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    if (jSONObject2.has("dimension") && jSONObject2.has(BadConnectionSignaling.KEY_BAD_NET_BITRATE)) {
                        arrayList.add(new Bitrate(jSONObject2.getInt("dimension"), jSONObject2.getInt(BadConnectionSignaling.KEY_BAD_NET_BITRATE)));
                    }
                }
                linkedHashMap.put(string.toLowerCase(Locale.ROOT), j5g.D0(new Comparator() { // from class: ru.ok.android.webrtc.PeerVideoSettingsBitrateTable$Companion$fromJson$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return jw5.b(Integer.valueOf(((PeerVideoSettingsBitrateTable.Bitrate) t).getBitrate()), Integer.valueOf(((PeerVideoSettingsBitrateTable.Bitrate) t2).getBitrate()));
                    }
                }, arrayList));
            }
            return new PeerVideoSettingsBitrateTable(linkedHashMap);
        }
    }

    public PeerVideoSettingsBitrateTable(Map<String, ? extends List<Bitrate>> map) {
        this.a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PeerVideoSettingsBitrateTable copy$default(PeerVideoSettingsBitrateTable peerVideoSettingsBitrateTable, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = peerVideoSettingsBitrateTable.a;
        }
        return peerVideoSettingsBitrateTable.copy(map);
    }

    public static final PeerVideoSettingsBitrateTable defaultTable() {
        return Companion.defaultTable();
    }

    public static final PeerVideoSettingsBitrateTable fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public static /* synthetic */ List getBitrateList$default(PeerVideoSettingsBitrateTable peerVideoSettingsBitrateTable, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = CODEC_GENERIC;
        }
        return peerVideoSettingsBitrateTable.getBitrateList(str);
    }

    public final PeerVideoSettingsBitrateTable copy(Map<String, ? extends List<Bitrate>> map) {
        return new PeerVideoSettingsBitrateTable(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PeerVideoSettingsBitrateTable) && epx.f(this.a, ((PeerVideoSettingsBitrateTable) obj).a);
    }

    public final int getBitrate(int i) {
        return getBitrate(i, CODEC_GENERIC);
    }

    public final List<Bitrate> getBitrateList(String str) {
        Map map = this.a;
        if (str == null) {
            str = "";
        }
        List<Bitrate> list = (List) map.get(str.toLowerCase(Locale.ROOT));
        return list == null ? EmptyList.b : list;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final boolean isEmpty() {
        if (this.a.isEmpty()) {
            return true;
        }
        Map map = this.a;
        if (map.isEmpty()) {
            return true;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!((List) ((Map.Entry) it.next()).getValue()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public String toString() {
        return "PeerVideoSettingsBitrateTable(bitrateTables=" + this.a + ")";
    }

    public final int getBitrate(int i, String str) {
        List list;
        Object obj;
        Object obj2;
        Object obj3;
        if ((str == null || (list = (List) this.a.get(str.toLowerCase(Locale.ROOT))) == null) && (list = (List) this.a.get(CODEC_GENERIC)) == null) {
            list = EmptyList.b;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((Bitrate) obj2).getDimension() == i) {
                break;
            }
        }
        Bitrate bitrate = (Bitrate) obj2;
        if (bitrate != null) {
            return bitrate.getBitrate();
        }
        List D0 = j5g.D0(new Comparator() { // from class: ru.ok.android.webrtc.PeerVideoSettingsBitrateTable$getBitrate$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return jw5.b(Integer.valueOf(((PeerVideoSettingsBitrateTable.Bitrate) t).getBitrate()), Integer.valueOf(((PeerVideoSettingsBitrateTable.Bitrate) t2).getBitrate()));
            }
        }, list);
        Iterator it2 = D0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it2.next();
            if (((Bitrate) obj3).getDimension() > i) {
                break;
            }
        }
        Bitrate bitrate2 = (Bitrate) obj3;
        ListIterator listIterator = D0.listIterator(D0.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            if (((Bitrate) previous).getDimension() < i) {
                obj = previous;
                break;
            }
        }
        Bitrate bitrate3 = (Bitrate) obj;
        if (bitrate3 != null && bitrate2 != null) {
            return bitrate3.getBitrate() + (((i - bitrate3.getDimension()) * (bitrate2.getBitrate() - bitrate3.getBitrate())) / (bitrate2.getDimension() - bitrate3.getDimension()));
        }
        if (bitrate2 != null) {
            return (bitrate2.getBitrate() * i) / bitrate2.getDimension();
        }
        if (bitrate3 != null) {
            return bitrate3.getBitrate();
        }
        return 0;
    }
}
