package xsna;

import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AdStatPixelsParser.kt */
/* loaded from: classes17.dex */
public final class ui0 {

    /* compiled from: AdStatPixelsParser.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdsItemBlockAdStatPixelDto.TypeDto.values().length];
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.RENDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.VIEWABILITY_MEASURABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.VIEWIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.CLICK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.CLICK_DEEPLINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.CLIP_AUTHOR_CLICK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.CLIP_SHARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.CLIP_COMMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.CLIP_SUBSCRIBE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.CLIP_LIKE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.CLIP_BOOKMARK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.CLOSED_BY_USER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.PLAYBACK_STARTED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.PLAYBACK_COMPLETED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.PLAYBACK_RESUMED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.PLAYBACK_PAUSED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.PLAYHEAD_REACHED_VALUE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.PLAYHEAD_VIEWABILITY_VALUE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.VOLUME_ON.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.VOLUME_OFF.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.VIDEO_FULLSCREEN_ON.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.VIDEO_FULLSCREEN_OFF.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.ERROR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.IMPRESSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(AdStatPixel adStatPixel, LinkedHashMap linkedHashMap) {
        AdStatPixel.Type zb = adStatPixel.zb();
        Object obj = linkedHashMap.get(zb);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(zb, obj);
        }
        ((List) obj).add(adStatPixel);
    }

    public static LinkedHashMap b(List list) {
        AdStatPixel.Position percent;
        Integer k;
        Integer k2;
        Integer k3;
        AdStatPixel.Position percent2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdsItemBlockAdStatPixelDto adsItemBlockAdStatPixelDto = (AdsItemBlockAdStatPixelDto) it.next();
            AdsItemBlockAdStatPixelDto.TypeDto i = adsItemBlockAdStatPixelDto.i();
            switch (i == null ? -1 : a.$EnumSwitchMapping$0[i.ordinal()]) {
                case 1:
                    String url = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url != null ? new AdStatPixel.Render(url) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    String url2 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url2 != null ? new AdStatPixel.ViewabilityMeasurable(url2) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    String url3 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url3 != null ? new AdStatPixel.ViewIn(url3) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    String url4 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url4 != null ? new AdStatPixel.ClickOnAction(url4) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    String url5 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url5 != null ? new AdStatPixel.ClickDeeplink(url5) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String url6 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url6 != null ? new AdStatPixel.ClickOnAuthor(url6) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    String url7 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url7 != null ? new AdStatPixel.ClickOnShare(url7) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    String url8 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url8 != null ? new AdStatPixel.ClickOnComments(url8) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    String url9 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url9 != null ? new AdStatPixel.ClickOnSubscribe(url9) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    String url10 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url10 != null ? new AdStatPixel.ClickOnLike(url10) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    String url11 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url11 != null ? new AdStatPixel.ClickOnFavorite(url11) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    String url12 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url12 != null ? new AdStatPixel.ClosedByUser(url12) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    String url13 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url13 != null ? new AdStatPixel.VideoStarted(url13) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    String url14 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url14 != null ? new AdStatPixel.VideoCompleted(url14) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    String url15 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url15 != null ? new AdStatPixel.VideoResumed(url15) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    String url16 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url16 != null ? new AdStatPixel.VideoPaused(url16) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    String url17 = adsItemBlockAdStatPixelDto.getUrl();
                    if (url17 != null) {
                        Integer j = adsItemBlockAdStatPixelDto.j();
                        if (j != null) {
                            percent = new AdStatPixel.Position.Time(j.intValue());
                        } else {
                            Integer f = adsItemBlockAdStatPixelDto.f();
                            percent = f != null ? new AdStatPixel.Position.Percent(f.intValue()) : null;
                        }
                        if (percent != null) {
                            r3 = new AdStatPixel.VideoPositionReached(url17, percent);
                        }
                    }
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    if (epx.f(adsItemBlockAdStatPixelDto.g(), "banner")) {
                        String url18 = adsItemBlockAdStatPixelDto.getUrl();
                        if (url18 != null && (k = adsItemBlockAdStatPixelDto.k()) != null) {
                            int intValue = k.intValue();
                            Integer d = adsItemBlockAdStatPixelDto.d();
                            if (d != null) {
                                r3 = new AdStatPixel.ViewabilityDuration(url18, intValue, d.intValue());
                            }
                        }
                        if (r3 != null) {
                            a(r3, linkedHashMap);
                            break;
                        } else {
                            break;
                        }
                    } else if (adsItemBlockAdStatPixelDto.e() == null) {
                        String url19 = adsItemBlockAdStatPixelDto.getUrl();
                        if (url19 != null && (k2 = adsItemBlockAdStatPixelDto.k()) != null) {
                            int intValue2 = k2.intValue();
                            Integer d2 = adsItemBlockAdStatPixelDto.d();
                            if (d2 != null) {
                                r3 = new AdStatPixel.VideoViewabilityDuration(url19, intValue2, d2.intValue());
                            }
                        }
                        if (r3 != null) {
                            a(r3, linkedHashMap);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        String url20 = adsItemBlockAdStatPixelDto.getUrl();
                        if (url20 != null && (k3 = adsItemBlockAdStatPixelDto.k()) != null) {
                            int intValue3 = k3.intValue();
                            Boolean e = adsItemBlockAdStatPixelDto.e();
                            if (e != null) {
                                boolean booleanValue = e.booleanValue();
                                Integer j2 = adsItemBlockAdStatPixelDto.j();
                                if (j2 != null) {
                                    percent2 = new AdStatPixel.Position.Time(j2.intValue());
                                } else {
                                    Integer f2 = adsItemBlockAdStatPixelDto.f();
                                    percent2 = f2 != null ? new AdStatPixel.Position.Percent(f2.intValue()) : null;
                                }
                                if (percent2 != null) {
                                    r3 = new AdStatPixel.VideoViewabilityAtPosition(url20, intValue3, booleanValue, percent2);
                                }
                            }
                        }
                        if (r3 != null) {
                            a(r3, linkedHashMap);
                            break;
                        } else {
                            break;
                        }
                    }
                    break;
                case 19:
                    String url21 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url21 != null ? new AdStatPixel.VideoVolumeOn(url21) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    String url22 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url22 != null ? new AdStatPixel.VideoVolumeOff(url22) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    String url23 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url23 != null ? new AdStatPixel.VideoFullscreenOn(url23) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 22:
                    String url24 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url24 != null ? new AdStatPixel.VideoFullscreenOff(url24) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 23:
                    String url25 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url25 != null ? new AdStatPixel.VideoError(url25) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
                case 24:
                    String url26 = adsItemBlockAdStatPixelDto.getUrl();
                    r3 = url26 != null ? new AdStatPixel.Impression(url26) : null;
                    if (r3 != null) {
                        a(r3, linkedHashMap);
                        break;
                    } else {
                        break;
                    }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), j5g.R((Iterable) entry.getValue()));
        }
        return linkedHashMap2;
    }
}
