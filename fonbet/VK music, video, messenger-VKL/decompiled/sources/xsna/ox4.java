package xsna;

import com.vk.biometrics.lock.impl.di.BiometricsLockComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.libvideo.api.di.WarmupComponent;
import com.vk.libvideo.impl.di.VkVideoDownloadRestrictionStatDelegateComponentImpl;
import com.vk.music.di.DefaultPlayerUIComponentImpl;
import com.vk.music.snippet.player.di.AudioSnippetPlayerComponentImpl;
import com.vk.superapp.subscriptions.js.bridge.api.di.JsSubscriptionsDelegateComponent;
import com.vk.superapp.subscriptions.js.bridge.impl.di.JsSubscriptionsDelegateComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import kotlin.Result;
import xsna.asu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ox4 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ox4(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r0 != false) goto L23;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object failure;
        int i;
        boolean z;
        boolean z2 = true;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AudioSnippetPlayerComponentImpl.b;
                return new AudioSnippetPlayerComponentImpl.b();
            case 1:
                qcy<Object>[] qcyVarArr2 = BiometricsLockComponentImpl.d;
                return new m97();
            case 2:
                qcy<Object>[] qcyVarArr3 = DefaultPlayerUIComponentImpl.h;
                return new q2k0();
            case 3:
                return pjg.a;
            case 4:
                o260 o260Var = d260.a;
                return Boolean.valueOf((o260Var != null ? o260Var : null).h().enable());
            case 5:
                NativeLibLoader.a.getClass();
                return NativeLibLoader.c();
            case 6:
                return new y6s();
            case 7:
                try {
                    failure = new JsSubscriptionsDelegateComponentImpl.a();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                JsSubscriptionsDelegateComponent.Companion.getClass();
                com.vk.superapp.subscriptions.js.bridge.api.di.a a = JsSubscriptionsDelegateComponent.a.a();
                boolean z3 = failure instanceof Result.Failure;
                Object obj = failure;
                if (z3) {
                    obj = a;
                }
                return (c8m) obj;
            case 8:
                return new nyo0();
            case 9:
                VKApplication.a aVar = VKApplication.c;
                i0q0.f(new VKApplication.c(0, upm0.a, upm0.class, "turnOff", "turnOff()V", 0));
                return s3q0.a;
            case 10:
                VideoFeatures videoFeatures = VideoFeatures.AUTOPLAY_ZONE_IMPROVEMENT;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 11:
                WarmupComponent.Companion.getClass();
                return WarmupComponent.Companion.b;
            case 12:
                return new BiometricsLockComponentImpl.a();
            case 13:
                return new VkVideoDownloadRestrictionStatDelegateComponentImpl.a();
            case 14:
                asu0.a invoke = asu0.u.invoke();
                asu0.a aVar2 = new asu0.a(invoke.a, Math.max((Runtime.getRuntime().availableProcessors() * 2) - 1, invoke.b), invoke.c, invoke.d, invoke.e, invoke.f, invoke.g, invoke.h, invoke.i, invoke.j);
                asu0.a.getClass();
                return asu0.E(aVar2, "vk-computation-thread-");
            case 15:
                return new ofv0(BuildInfo.h());
            case 16:
                if (BuildInfo.e != 99999 || !BuildInfo.h()) {
                    eqy<bek0> eqyVar = com.vk.toggle.d.a;
                    b.d i2 = com.vk.toggle.b.A.i(CoreFeatures.SINGLE_PREF_FULL_V2);
                    try {
                        i = Integer.parseInt(i2 != null ? i2.c.toString() : null);
                    } catch (Throwable unused) {
                        i = 0;
                    }
                    if (i != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            default:
                return xqm0.g("\n        <script>\n            /* Предполагается что можно получить все заголовки, адрес и метод запроса\n             * в onWebAppProxyInterceptAsyncRequest будет передаваться base64 от тела запроса\n             * base64 надо распаковать и отправить как есть, там можем быть и просто JSON и multipart/form-data\n             * и просто пустая строка\n             */\n            \n            (function() {\n              const debugEnabled = " + BuildInfo.h() + ";\n            \n              function log(...args) {\n                if (!debugEnabled) {\n                  return;\n                }\n                console.log(...args);\n              }\n            \n              const bridge = window['AndroidBridge'] || {\n                onWebAppCheckHost: () => false,\n                onWebAppProxyAddAwaitRequest: () => {},\n                onWebAppProxyInterceptAsyncRequest: () => {},\n                onWebAppProxyDeviceInfo: () => {},\n              };\n            \n              function getDeviceInfoCookie() {\n                const screen /* c */ = window.screen;\n                const width /* g */ = screen.width || 0;\n                const height /* c */ = screen.height || 0;\n                const dpr /* n */ = window.devicePixelRatio || 1;\n                           \n                // !!!!!!! - Flags                      \n                // supportsXhr,\n                // supportsFile,\n                // supportsTouch,\n                // supportsGeo,\n                // supportsAudioMpeg,\n                // supportsTransform,\n                // supportsFileAPI                     \n                return [width, height, dpr, '!!!!!!!'].join('/');\n              }\n            \n              bridge.onWebAppProxyDeviceInfo(getDeviceInfoCookie());\n            \n              /**\n               * Добавляет к адресу домен origin если это требуется\n               * чтобы url всегда был https://domain.ru/...\n               * @param {string} url\n               * @return string\n               */\n              function createFullUrl(url) {\n                return (new URL(url, location.href)).toString();\n              }\n            \n              /**\n               * @param {string} url\n               * @return boolean\n               */\n              function isUrlBlocker(url) {\n                return bridge.onWebAppCheckHost(createFullUrl(url));\n              }\n            \n              /**\n               * @param {string} requestId\n               */\n              function registerBodyId(requestId) {\n                bridge.onWebAppProxyAddAwaitRequest(requestId);\n              }\n            \n              /**\n               * @param {string} requestId\n               * @param {string} data\n               * @param {string} contentType\n               */\n              function setBodyForRequestId(requestId, data, contentType) {\n                bridge.onWebAppProxyInterceptAsyncRequest(requestId, data, contentType);\n              }\n            \n              function generateRandom() {\n                return Math.random().toString().split('.')[1];\n              }\n            \n              /**\n               * @param {FormData|Blob|ArrayBuffer|string|null} body\n               * @param {string} method\n               * @param {string} url\n               * @param {object} headers\n               * @return {Promise<[string,string]>}\n               */\n              function createBodyData(body, method, url, headers) {\n                if (!body) return Promise.resolve().then(() => ['', '']);\n                const request = new Request(url, {\n                  method: method,\n                  body: body,\n                  headers: headers,\n                });\n                return requestBoBase64(request);\n              }\n            \n              /**\n               * @param {Request} request\n               * @return {Promise<[string,string]>}\n               */\n              function requestBoBase64(request) {\n                return request.blob().then(blob => {\n                  const contentType = request.headers.get('content-type') || \"\";\n                  log('Request content size:' + blob.size);\n                  log('Request header Content-Type:' + contentType);\n                  if (blob.size === 0) {\n                    return ['', contentType];\n                  }\n                  return new Promise((resolve, reject) => {\n                    const reader = new FileReader();\n                    reader.onload = function() {\n                      // const indexOfStart = reader.result.indexOf('base64,') + 7;\n                      // resolve(reader.result.slice(indexOfStart));\n                      resolve([reader.result, contentType]);\n                    };\n                    reader.onerror = function(e) {\n                      reject(e);\n                    };\n                    reader.readAsDataURL(blob);\n                  });\n                });\n              }\n            \n              function shortPrint(string) {\n                if (!string) return '<empty>';\n                return string.length < 500 ? string : string.slice(0, 500) + '..[length:' + string.length + ']';\n              }\n            \n              const nativeOpen = XMLHttpRequest.prototype.open;\n              const nativeSend = XMLHttpRequest.prototype.send;\n              const nativeSetRequestHeader = XMLHttpRequest.prototype.setRequestHeader;\n            \n              XMLHttpRequest.prototype.open = function(method, url) {\n                this.savedMethod = method;\n                this.savedUrl = url;\n                this.savedHeaders = {};\n                if (isUrlBlocker(url)) {\n                  this.requestId = generateRandom();\n                  arguments[1] = url + '_VK_PROXY_REQUEST_' + this.requestId;\n                  log('XMLHttpRequest catch url:' + url + ' requestId: ' + this.requestId);\n                  return nativeOpen.apply(this, arguments);\n                } else {\n                  log('XMLHttpRequest skip url:' + url + ' not blocked');\n                  return nativeOpen.apply(this, arguments);\n                }\n              };\n            \n              XMLHttpRequest.prototype.setRequestHeader = function(name, value) {\n                // see https://learn.javascript.ru/xmlhttprequest\n                if (this.savedHeaders[name]) {\n                  this.savedHeaders[name] += ', ' + value;\n                } else {\n                  this.savedHeaders[name] = value;\n                }\n                nativeSetRequestHeader.apply(this, arguments);\n              };\n            \n              XMLHttpRequest.prototype.send = function(body) {\n                if (!this.requestId) {\n                  nativeSend.apply(this, arguments);\n                  return;\n                }\n                log('XMLHttpRequest got body for requestId: ' + this.requestId, body);\n            \n                registerBodyId(this.requestId);\n                createBodyData(body, this.savedMethod, this.savedUrl, this.savedHeaders)\n                  .then(bodyAndContentType => {\n                    log('XMLHttpRequest body for requestId: ' + this.requestId + ' processed', bodyAndContentType[1], shortPrint(bodyAndContentType[0]));\n                    setBodyForRequestId(this.requestId, bodyAndContentType[0], bodyAndContentType[1]);\n                    nativeSend.apply(this, arguments);\n                  })\n                  .catch(e => {\n                    log('XMLHttpRequest body for requestId: ' + this.requestId + ' processing fail', e);\n                    nativeSend.apply(this, arguments);\n                    this.abort();\n                  });\n              };\n            \n              const originalFetch = window.fetch;\n            \n              window.fetch = async function(url, params) {\n                /**\n                 * @type {Request}\n                 */\n                let request = url;\n                if (!(url instanceof Request)) {\n                  request = new Request(url, params);\n                } else {\n                  request = request.clone();\n                }\n            \n                if (isUrlBlocker(request.url)) {\n                  const requestId = generateRandom();\n                  log('Fetch catch url: ' + url + ' requestId: ' + requestId);\n                  registerBodyId(requestId);\n                  try {\n                    const bodyAndContentType = await requestBoBase64(request);\n                    setBodyForRequestId(requestId, bodyAndContentType[0], bodyAndContentType[1]);\n                    log('Fetch body for requestId: ' + requestId + ' processed', bodyAndContentType[1], shortPrint(bodyAndContentType[0]));\n                    const patchedRequest = new Request(request.url + '_VK_PROXY_REQUEST_' + requestId);\n                    return originalFetch.apply(this, [patchedRequest]);\n                  } catch (e) {\n                    log('Fetch body for requestId: ' + requestId + ' processing fail.', e);\n                    throw e;\n                  }\n                } else {\n                  log('Fetch skip url, not blocked', url);\n                  return originalFetch.apply(this, arguments);\n                }\n              };\n            \n              log('interceptor installed successful');\n            })();\n        </script>\n        ");
        }
    }
}
